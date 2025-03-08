package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(("https://www.snapdeal.com/"));
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		WebElement mensfashion = driver.findElement(By.xpath("//*[@class='catText'][contains(text(),'Men')]"));
		act.pause(3000).moveToElement(mensfashion).perform();
		
		WebElement shoes = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/products/mens-footwear-sports-shoes']/span"));
		act.pause(3000).moveToElement(shoes).perform();
		shoes.click();
		
		String count = driver.findElement(By.xpath("//a[@href='/products/mens-footwear-sports-shoes#bcrumbLabelId:255']/div[2]")).getText();
		System.out.println(count);
		
		
		driver.findElement(By.xpath("//a[@href='/products/mens-training-shoes#bcrumbLabelId:255']/div[1]")).click();
		driver.findElement(By.xpath("//*[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//*[@class='sort-value']/li[2]")).click();
		
		WebElement pricerange = driver.findElement(By.xpath("(//*[@class='price-text-box']/input)[1]"));
		act.pause(2000).moveToElement(pricerange).perform();
		pricerange.clear();
		pricerange.sendKeys("500");
		
		
		WebElement pricerange1 = driver.findElement(By.xpath("(//*[@class='price-text-box']/input)[2]"));
		act.pause(2000).moveToElement(pricerange1).perform();
		pricerange1.clear();
		pricerange1.sendKeys("700");
		
		driver.findElement(By.xpath("//*[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(4000);
		WebElement color = driver.findElement(By.xpath("(//*[@class='sdCheckbox filters-list '])[1]"));
		act.pause(2000).scrollByAmount(160,650).perform();
		Thread.sleep(6000);
		color.click();
		
		Thread.sleep(4000);
		String filter1 = driver.findElement(By.xpath("(//a[@class='clear-filter-pill  '][contains(text(),'White')])[1]")).getText();
		String filter2 = driver.findElement(By.xpath("(//a[@class='clear-filter-pill'][contains(text(),'500')])[1]")).getText();
		System.out.println(filter1);
		System.out.println(filter2);
		
		
		
		WebElement firstresult = driver.findElement(By.xpath("//p[@title='RICKENBAC Blue Training Shoes']"));
		act.pause(2000).moveToElement(firstresult).perform();
		
		driver.findElement(By.xpath("//*[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//*[@class='payBlkBig']")).getText();
		System.out.println(price);
		
		String discount = driver.findElement(By.xpath("//*[@class='percent-desc ']")).getText();
		System.out.println(discount);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
           //Move image file to new destination
               File DestFile=new File("C:/Users/205299/Desktop/TestLeaf/Snapdeal.png");
               //Copy file at destination
               FileUtils.copyFile(SrcFile, DestFile);
               
               driver.findElement(By.xpath("//*[@class='close close1 marR10']")).click();
               driver.close();
		
	}

}
