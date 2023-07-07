import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//url of the website
	
		//Capture the Screenshot
		
		WebElement usernameField=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("Admin");
		
		WebElement passwordField=driver.findElement(By.xpath("(//div/input)[2]"));
		passwordField.sendKeys("admin123");
		
		WebElement buttonField=driver.findElement(By.tagName("button"));
		buttonField.click();	

		File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File("JavaFileoperation\\screenshot.png"));
		System.out.println("Screenshot Captured");
		//Capture the Screenshot
//		File screenshot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot2, new File("D:\\JavaConcept\\JavaFileoperation\\screenshot.jpg"));
//		System.out.println("Screenshot Captured");
		
		
		
		
		
		
	}

}
