package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	
	ChromeDriver driver= new ChromeDriver();

	public void navigateToHomePage(String url) {
		
		driver.get("http://leaftaps.com/opentaps/");//Load the URL
		driver.manage().window().maximize();
		System.out.println("loading the url");
	}

	public void enterCredentials() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter pwd
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	

}
