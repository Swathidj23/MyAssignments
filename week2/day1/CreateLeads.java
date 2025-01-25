package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");//Enter company name
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("learning Selenium");//Enter title
		driver.findElement(By.className("smallSubmit")).click();//Click on create Lead
		Thread.sleep(3000);
		String title = driver.getTitle();//Get the browser title
		System.out.println(title);
		driver.close();

	}

}
