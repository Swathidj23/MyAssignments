package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();// Open Chrome browser
		driver.get("https://www.leafground.com/button.xhtml");//Load the URL
		driver.manage().window().maximize();//Browser Maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Implicit wait
		
		//click on confirm title button 
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String exptitle = driver.getTitle();
		String actualtitle ="Dashboard";
		if(exptitle.equals(actualtitle)) {
			System.out.println("title is as expected");
		}else {
			System.out.println("Title is wrong");
		}
		
        //navigate back to the buttuon url main page
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Button')])[1]")).click();
		
		//verify if the button is disabled 
		WebElement dd = driver.findElement(By.xpath("((//h5[contains(text(),'Confirm if the button is disabled.')])/following::button)[1]"));
		if(dd.isEnabled()) {
			System.out.println("Button is enabled");
		}else {
			System.out.println("button is disabled");
		}
		
		
		//Print position of the button 
		Point position = driver.findElement(By.xpath("((//h5[contains(text(),'Submit button')])/following::button)[1]")).getLocation();
        System.out.println("Location of the submit button is  "+position);
        
        
        //Print the color of the button 
        String color = driver.findElement(By.xpath("((//h5[contains(text(),'Save')])/following::button)[1]")).getCssValue("color");
        System.out.println("Color of the button is "+color);
        
        //print height and width of the button 
        Dimension size = driver.findElement(By.xpath("((//h5[contains(text(),'height')])/following::button)[1]")).getSize();
        System.out.println("Height and Width of the button is "+size);
        
        //close the browser
        driver.close();
        
	}

}
