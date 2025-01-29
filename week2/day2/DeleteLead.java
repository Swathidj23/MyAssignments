package week2.day2;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();// Open Chrome browser
		driver.get("http://leaftaps.com/opentaps/");//Load the URL
		driver.manage().window().maximize();//Browser Maximize
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//Enter Username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter pwd
		driver.findElement(By.className("decorativeSubmit")).click();//Click on login
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();//Click on CRM link
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Leads")).click();//CLick on Leads
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Find Leads")).click();//click find leads
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='subSectionBlock']//form//li//span/span)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("phoneNumber")).sendKeys("0000000000");//enter ph no.
		driver.findElement(By.xpath("//table/tbody/tr//td[2]/em/button[contains(text(),'Find')]")).click();//click find leads
		Thread.sleep(3000);
		//capture and print first lead ID foudn in search
		String leadID= driver.findElement(By.xpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println("First lead ID =" +leadID);
		//click on first value 
		driver.findElement(By.xpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		//click on delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='frameSectionExtra'])/a[contains(text(),'Delete')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("Find Leads")).click();//click find leads
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ext-gen246']")).sendKeys(leadID);//enter the captured value 
		driver.findElement(By.xpath("//table/tbody/tr//td[2]/em/button[contains(text(),'Find')]")).click();//click find leads
		Thread.sleep(3000);
		//assert no recrods found 
		String Noofrecordsactual = driver.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
		System.out.println("print no of records found:\n" +Noofrecordsactual);
		String expectedresult = "No records to display";
		System.out.println(expectedresult);
	
		if(expectedresult.equals(Noofrecordsactual)) {
			System.out.println("Assert is pass");
		}else {
			System.out.println("Assert is fail");
		}
		   driver.close();
		
	}

}
