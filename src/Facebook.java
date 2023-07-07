import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//maxmize the browser window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//url of the website
		WebElement newaccountField=driver.findElement(By.linkText("Create new account"));
		driver.findElement(By.cssSelector("input[id*=\"p\"]"));
		
		
		newaccountField.click();
//		WebElement emailField=driver.findElement(By.id("email"));
//		emailField.sendKeys("test@gmail.com");
//		Thread.sleep(3000);
//		emailField.clear();
//		emailField.sendKeys("lavish@gmail.com");
//		
//		WebElement passwordField=driver.findElement(By.name("pass"));
//		passwordField.sendKeys("admin123");
//		
//		WebElement loginField=driver.findElement(By.name("login"));
//		loginField.click();
		
//		driver.close();
	}

}
