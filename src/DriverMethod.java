import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		
		driver.get("https://www.google.com/");//url of the website
//		driver.navigate().to("https://www.guvi.in/");

//		driver.navigate().refresh();

//		driver.navigate().back();
		
		//get the title
		String title=driver.getTitle();
		System.out.println(title);//GUVI | Learn to code in your native language

		
		//Get the current page url
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);//https://www.guvi.in/

		//Get and store the domain name in variable using javascript executor;
		
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		String Domainjs=(String) javascript.executeScript("return document.domain");
		System.out.println(Domainjs);
		
		
		//check if search boc is enable or not
		WebElement searchField=driver.findElement(By.xpath("//textarea[@type='search']"));
		WebElement buttonSearch=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		if(searchField.isEnabled()) {
			System.out.println("Google search text is enabled");
			searchField.sendKeys("Guvi");
			buttonSearch.click();
	
		}else {
			System.out.println("You have encountered an error");
		}
		
	}

}
