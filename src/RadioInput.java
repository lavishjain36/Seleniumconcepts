import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://demoqa.com/radio-button");
	
		WebElement impRBtn=driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
		WebElement yesRBtn=driver.findElement(By.cssSelector("label[for='yesRadio']"));

		impRBtn.click();
		yesRBtn.click();
	

	}

}
