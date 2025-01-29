package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();// Open Chrome browser
		driver.get("https://en-gb.facebook.com/");//Load the URL
		driver.manage().window().maximize();//Browser Maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.partialLinkText("Sign Up")).click();//Click on create account
        driver.findElement(By.name("firstname")).sendKeys("Swathi"); //enter first name
        driver.findElement(By.name("lastname")).sendKeys("Babu");//enter surname
        driver.findElement(By.name("reg_email__")).sendKeys("9962377688");//Enter email or ph no
        driver.findElement(By.name("reg_passwd__")).sendKeys("Nithin@123");//Enter pwd
        driver.findElement(By.xpath("(//*[@data-name='gender_wrapper']/span/label/input)[1]")).click();
        
        //Enter values to date
        Thread.sleep(3000);
        WebElement date = driver.findElement(By.name("birthday_day"));
        Select options = new Select (date);
        options.selectByVisibleText("23");
        
        //Enter values of Month
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select options1 = new Select (month);
        options1.selectByVisibleText("Sep");
        
      //Enter values of year
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select options2 = new Select (year);
        options2.selectByVisibleText("1991");
        Thread.sleep(3000);
        driver.close();
        
	
	}

}
