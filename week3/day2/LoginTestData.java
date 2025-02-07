package week3.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestData extends TestData{
	public void enterUsername() {
		super.enterCredentials();
		System.out.println("entering user name ");
		
		
		
	}
	
	public void enterPassword() {
		System.out.println("entering pwd ");
		
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		LoginTestData login = new LoginTestData();
		login.navigateToHomePage("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();//Browser Maximize
		Thread.sleep(3000);
		login.enterUsername();
		login.enterPassword();
	}
}
