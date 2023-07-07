import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		
//		driver.get("https://www.guvi.in/");//url of the website
//		WebElement submitField=driver.findElement(By.linkText("Login"));
//		//create an instance of Actions Class ->object
		Actions	actions=new Actions(driver);
//		actions.click(submitField).build().perform();
//		Thread.sleep(5000);
		
//		driver.navigate().to("https://www.guvi.in/sign-in");
//		WebElement googlebutton=driver.findElement(By.id("google-button"));
//
//		actions.doubleClick(googlebutton).build().perform();
		
		
//		Thread.sleep(3000);
//		driver.close();
		
		
//	    driver.get("https://www.amazon.com/");
//	    WebElement hoverElement=driver.findElement(By.id("nav-link-accountList"));
//	    actions.moveToElement(hoverElement).build().perform();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement titleD=driver.findElement(By.xpath("(//ul/li)[5]"));
		actions.moveToElement(titleD);
		actions.clickAndHold().perform();
//		actions.release().perform();
	}

}
