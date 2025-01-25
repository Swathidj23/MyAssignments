package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
	driver.findElement(By.partialLinkText("Accounts")).click();//CLick on Accounts tab
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Create Account")).click();//Click on create account
	Thread.sleep(3000);
	driver.findElement(By.name("accountName")).sendKeys("Swathidj23");//Enter the account name
	driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester45");//Enter description
	driver.findElement(By.id("numberEmployees")).sendKeys("2");//Enter no. of employees
	driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps1");//Enter site desc
	driver.findElement(By.className("smallSubmit")).click();//Click on create account
	Thread.sleep(3000);
	String title = driver.getTitle();//Get the browser title
	System.out.println(title);
	driver.close();
	
	
	
	

	}

}
