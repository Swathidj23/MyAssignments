package week5.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get(("https://finance.yahoo.com/"));
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		WebElement market = driver.findElement(By.xpath("(//a[@href='https://finance.yahoo.com/markets/'])[2]"));
		act.pause(3000).moveToElement(market).perform();
		
		WebElement crypto = driver.findElement(By.xpath("(//a[@href='https://finance.yahoo.com/markets/crypto/all/'])[2]"));
		act.pause(3000).moveToElement(crypto).perform();
		crypto.click();
		
		
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='tableContainer yf-j24h8w']/div/table/tbody/tr/td"));
		int rowCount = row.size();
		System.out.println("Row value :"+rowCount);
		
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='tableContainer yf-j24h8w']/div/table/tbody/tr[1]/td"));
		int colCount = col.size();
		System.out.println("Col value:"+colCount);
		
		for (int i =1; i <=rowCount; i++) {
			for (int j =1; j<=colCount; j++) {
				
				WebElement table = driver.findElement(By.xpath("//div[@class='tableContainer yf-j24h8w']/div/table/tbody/tr[1]/td[1]"));
				act.pause(3000).moveToElement(table).perform();
				String contents = driver.findElement(By.xpath("//div[@class='tableContainer yf-j24h8w']/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(contents);
			}
			
		}
		
		
		
		
		

	}

}
