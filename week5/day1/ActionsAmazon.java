package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;



public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("No. of rating for the Product is "+ ratings);
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		String title = driver.getTitle();
		System.out.println(title);
		//convert set into list
		List<String> windowHandle = new ArrayList<String>(allwindow);
		
		//switch to child window
		driver.switchTo().window(windowHandle.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		//Convert web driver object to TakeScreenshot

    
		TakesScreenshot scrShot =((TakesScreenshot)driver);
         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
                File DestFile=new File("C:/Users/205299/Desktop/TestLeaf/img1.png");
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
                
               // driver.switchTo().window(windowHandle.get(1));
            Actions act=new Actions(driver);
              WebElement addtoCart = driver.findElement(By.xpath("(//*[@id='add-to-cart-button'])[2]"));
              act.pause(3000).scrollToElement(addtoCart).perform();
               driver.findElement(By.xpath("(//*[@id='add-to-cart-button'])[2]")).click();
              // driver.close();
               
               driver.switchTo().alert();
               String expected = "₹69,998.00";
               String actual = driver.findElement(By.xpath("//*[@id='attach-accessory-cart-subtotal']")).getText();
               System.out.println(actual);
               if(expected.equals(actual)) {
            	   System.out.println("equal");
            	  
               }
               
               
               
        		driver.quit();
		
		
		
		

	}

}
