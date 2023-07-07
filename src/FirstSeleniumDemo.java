import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumDemo {

	public static void main(String[] args) {
		
		//set the path to the chromedriver executables
//		System.setProperty("webdriver.chrome.driver","D://driver//chromedriver.exe");
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//url of the website
		
		//verify if the titile of the page is=Google
		if(driver.getTitle().equals("Google")) {
			System.out.println("We have landed on the correct website");
		}else {
			System.out.println("We have not landed on the right website");
		}
		
	
		driver.close();
		
	}

}
