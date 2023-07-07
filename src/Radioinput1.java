import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radioinput1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://flightnewapp.netlify.app/lavish.com/dropdownspractise/");
		
//		List<WebElement> allitems=driver.findElements(By.xpath("//input[@type='radio']"));
//		int count=1;
//		String result = null;
//		for(WebElement element:allitems) {
//			System.out.println(element.getAttribute("value"));
//			
//		}
//		
//		System.out.println("One way Trip " +count);
		
		
//		Select all links on the page -? a
		List<WebElement> allitems=driver.findElements(By.xpath("//a"));
		System.out.println(allitems.size());
		
	
	}

}
