package week1.day2;

public class Browser {
	public String BrowserName(String browserName) {
		System.out.println("Browser URL loaded Successfully");
		return(browserName);

	}
	
	public void LoadUrl() {
		System.out.println("Application URL loaded Successfully");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bo= new Browser();
		bo.BrowserName("Chrome");
		bo.LoadUrl();

	}


}
