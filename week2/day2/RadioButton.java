package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();// Open Chrome browser
		driver.get("https://www.leafground.com/radio.xhtml");//Load the URL
		driver.manage().window().maximize();//Browser Maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//Implicit wait
		
		//select the chrome browser- favourite browser select
		driver.findElement(By.xpath("//label[contains(text(),'Chrome')]//preceding::div[1]")).click();
		
		//again select the same to deselect
		Thread.sleep(200);
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]/preceding::div[1]")).click();
		
		//Click again to deselect
		Thread.sleep(200);
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]/preceding::div[1]")).click();
        
		//verify if the element is disabled 
				WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Chennai')]/preceding::div[1]"));
					if(element.isSelected()) {
				System.out.println("Chennai is already selected");
					}else
					{
						System.out.println("Chennai is not selected");
						Thread.sleep(200);
					}
					
		//print the value which is already selected by default for the radio button 
			String valueofbrowserdefaulted = driver.findElement(By.xpath("(//label[contains(text(),'Safari')])[2]")).getText();
			System.out.println("Defaulty selected browser is : "+valueofbrowserdefaulted);	
			Thread.sleep(200);
					
					
		//verify the already selected value and print the same 
		WebElement agegrp =	driver.findElement(By.xpath("(//label[contains(text(),'21-40')]/preceding::div[1])"));
		String valueofageradiobutton = driver.findElement(By.xpath("(//label[contains(text(),'21-40')])")).getText();
		System.out.println("Defaulty selected age grp is : "+valueofageradiobutton);
		Thread.sleep(200);
		
		//if the element is not already selected, pls select the same 
		if (agegrp.isEnabled()) {
			System.out.println("Age grp " +valueofageradiobutton+" is already selected by Default");
		}else
		{
			driver.findElement(By.xpath("//label[contains(text(),'21-40')]/preceding::div[1]")).click();
		}
		Thread.sleep(300);
		driver.close();
	}

}
