package week4.day1;

import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//Implicit wait
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);// enter bags and search
		driver.findElement(By.xpath("(//*[@class='facet-linkhead'])[2]/label")).click();//select Men from the list
		Thread.sleep(2000);
		//select fashion bags from the list
		driver.findElement(By.xpath("(//*[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags'])")).click();
		
       List<WebElement> brandname = driver.findElements(By.xpath("//*[@class='brand']/strong"));
       List<WebElement> bagname = driver.findElements(By.xpath("//*[@class='nameCls']"));
		
       
		int totalSize = brandname.size();
		System.out.println("Total items is present :"+totalSize);
		
		//to print the brand name in the filtered list
		for (int i = 0; i < brandname.size(); i++) {
			
			String text = brandname.get(i).getText();
			System.out.println(text);

	}
		//to print the bag names in the filtered list
for (int j = 0; j < bagname.size(); j++) {
			
			String text = bagname.get(j).getText();
			System.out.println(text);

	}

	}}


