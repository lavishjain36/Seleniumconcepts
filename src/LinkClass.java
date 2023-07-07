import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://www.google.com/");
		
		try {
			List<WebElement> number=driver.findElements(By.tagName("a"));
			int nooflinks=number.size();
			System.out.println(nooflinks);
			
			for(WebElement pagelink:number) {
				String linktext=pagelink.getText();
				String link=pagelink.getAttribute("href");
				System.out.println(linktext+" => ");
				System.out.println(link);
			}
			
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	

	}

}
