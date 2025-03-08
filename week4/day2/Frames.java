package week4.day2;

import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Implicit wait

		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(20);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String expected = "Hello Harry Potter! How are you today?";
		String actual = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println("text is "+actual);
		if(expected.equals(actual)) {
			System.out.println("title is as expected");
		}else {
			System.out.println("Title is wrong");
		}
		
		

	}

}
