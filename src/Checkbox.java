import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://flightnewapp.netlify.app/lavish.com/dropdownspractise/");
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'fr')]")).isSelected());//false
		driver.findElement(By.xpath("//input[contains(@id,'fr')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'fr')]")).isSelected());//true

		Actions actions=new Actions(driver);
		actions.click();
		
			
	}
}
