package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Open Browser
		ChromeDriver driver = new ChromeDriver();//launch Browser
				driver.manage().window().maximize();//Maximize browser
				// Open URL
				driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
				Thread.sleep(3000);
				driver.findElement(By.id("btnCloseModal")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("userName")).sendKeys("190239934923");
				Thread.sleep(3000);
				driver.close();

	}

}
