package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDay2W2 {

	
		public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver= new EdgeDriver();// Open Chrome browser
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
			driver.findElement(By.id("accountName")).sendKeys("Swathidj231");//Enter the account name
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester451");//Enter description
			//to select values from industry drop down
			Thread.sleep(3000);
			WebElement industry = driver.findElement(By.name("industryEnumId"));
			Select options=new Select(industry);
			options.selectByVisibleText("Computer Software");
			//to select values from ownership drop down
			Thread.sleep(3000);
			WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
			Select options1=new Select(ownership);
			options1.selectByVisibleText("S-Corporation");
			//to select values from source drop down
			Thread.sleep(3000);
			WebElement sourceId = driver.findElement(By.name("dataSourceId"));
			Select options2=new Select(sourceId);
			options2.selectByValue("LEAD_EMPLOYEE");
			//to select values from marketing drop down
			Thread.sleep(3000);
			WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
			Select options3=new Select(marketing);
			options3.selectByIndex(6);
			//to select values from state drop down
			Thread.sleep(3000);
			WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select options4=new Select(state);
			options4.selectByValue("TX");
			
			Thread.sleep(3000);
			driver.findElement(By.className("smallSubmit")).click();//Click on create account
			Thread.sleep(3000);
			String title = driver.getTitle();//Get the browser title
			System.out.println(title);
			driver.close();

	}

}
