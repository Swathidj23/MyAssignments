package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();// Open Chrome browser
		driver.get("https://leafground.com/checkbox.xhtml");//Load the URL
		driver.manage().window().maximize();//Browser Maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//check the basic check box 
		driver.findElement(By.xpath("//*[h5='Basic Checkbox']/div/div/div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//check the notification check box 
		driver.findElement(By.xpath("//*[h5='Notification']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//check the tristate 
		driver.findElement(By.xpath("//*[h5='Tri State Checkbox']/div/div/div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//check the toggle button
		driver.findElement(By.xpath("//*[h5='Toggle Switch']/div/div[@class='ui-toggleswitch-slider']")).click();
		//verify message
		Thread.sleep(2000);
		String toggleactual = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(toggleactual);
		String toogleexpected ="Checked";
		if(toogleexpected.equals(toggleactual)) {
			System.out.println("Texts are same");
		}else
		{
			System.out.println("Texts are not same");
		}
		
		//verify the disabled toggle button 
		WebElement element = driver.findElement(By.xpath("//*[h5='Verify if check box is disabled']/div/div/div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
			System.out.println("Is element enabled ? : "+element.isEnabled());
			
		//select multiple value drop down 
			WebElement element1= driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
			Select options = new Select(element1);
			options.selectByIndex(3);
			options.selectByIndex(4);

		Browser.close();
	
		
		
		

	}

}
