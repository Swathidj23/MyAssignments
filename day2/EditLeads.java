package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {

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
		driver.findElement(By.partialLinkText("Create Lead")).click();//Click on Leads
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swathi");//Enter the firstname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");//Enter last name
		driver.findElement(By.name("firstNameLocal")).sendKeys("DJ");//Enter first name local
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");//Enter company name
		driver.findElement(By.name("description")).sendKeys("adding desc for leads edit");// enter desc
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("swathidj23@gmail.com");//enter email 
		
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));//enter state
		Select options4=new Select(state);
		options4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();//Click on create Lead
		Thread.sleep(3000);
	    //Edit lead
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.name("description")).sendKeys(Keys.CLEAR);// clear desc
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updating leads");// enter the important note field values
		driver.findElement(By.className("smallSubmit")).click();//Click on update Lead

		//title copy 
		String title = driver.getTitle();//Get the browser title
		System.out.println(title);
		driver.close();


	}

}
