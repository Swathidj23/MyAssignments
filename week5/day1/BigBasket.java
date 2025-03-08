package week5.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver = new ChromeDriver();
			driver.get(("https://www.bigbasket.com/"));
			driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
	
		Actions act= new Actions(driver);
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.pause(3000).moveToElement(food).perform();
		Thread.sleep(3000);
		WebElement rice = driver.findElement(By.linkText("Rice & Rice Products"));
		act.pause(4000).moveToElement(rice).perform();
		Thread.sleep(3000);
		WebElement boiledrice = driver.findElement(By.linkText("Boiled & Steam Rice"));
		act.pause(5000).moveToElement(boiledrice).perform();
		boiledrice.click();
		Thread.sleep(3000);
		WebElement bbroyal = driver.findElement(By.id("i-BBRoyal"));
		act.pause(3000).scrollByAmount(0, 1000).perform();
		bbroyal.click();
		Thread.sleep(2000);
		WebElement Tamilponni = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni')]"));
		act.pause(3000).scrollToElement(Tamilponni).perform();
		Tamilponni.click();
		
		Set<String> allwindow = driver.getWindowHandles();
		List<String> windowHandle = new ArrayList<String>(allwindow);
		driver.switchTo().window(windowHandle.get(1));
		
		Thread.sleep(4000);
		WebElement fivekg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		act.pause(3000).scrollToElement(fivekg).perform();
		fivekg.click();
		
		String Priceactual = driver.findElement(By.xpath("//table/tr[2]/td[contains(text(),'Price')]")).getText();
		System.out.println(Priceactual);
		driver.findElement(By.xpath("(//button[contains(text(),'Add to basket')])[1]")).click();
		
		Thread.sleep(3000);
		String successmsg = driver.findElement(By.xpath("//p[contains(text(),'An item has been added')]")).getText();
		System.out.println(successmsg);
		
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
           //Move image file to new destination
               File DestFile=new File("C:/Users/205299/Desktop/TestLeaf/BB.png");
               //Copy file at destination
               FileUtils.copyFile(SrcFile, DestFile);
               
               driver.close();
               driver.switchTo().window(windowHandle.get(0));
               driver.quit();
		
		
		
		
		
        
		
		
		
		
		
		
		
	}

}
