import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/register");//url of the website
//		id="firstName"
//				id="lastName"
//				id="emailInput"
//				id="passwordInput"
//				id="mobileNumberInput"
//				id="signup"

		//First script with id
//		WebElement firstNameField=driver.findElement(By.id("firstName"));
		WebElement firstNameField=driver.findElement(By.name("email"));
		firstNameField.sendKeys(("Priya"));
		
		WebElement lastNameField=driver.findElement(By.id("lastName"));
		lastNameField.sendKeys(("Balakrishnan"));
		
		WebElement emailNameField=driver.findElement(By.id("emailInput"));
		emailNameField.sendKeys(("priya@gmail.com"));
		
		WebElement passwordField=driver.findElement(By.id("passwordInput"));
		passwordField.sendKeys(("admin123"));
		
		WebElement mobileNoField=driver.findElement(By.id("mobileNumberInput"));
		mobileNoField.sendKeys(("91023457747"));
		
		Thread.sleep(1000);
		WebElement signupClick=driver.findElement(By.id("signup"));
		signupClick.click();
		
		
		
		
		
	}

}
