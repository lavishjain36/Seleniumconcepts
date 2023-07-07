import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://only-testing-blog.blogspot.com/2014/05/login.html");
		WebElement text=driver.findElement(By.xpath("(//h1)[2]"));
		
		//read font-size of text
		String fontSize=text.getCssValue("font-size");
		System.out.println("Font-Size "+ fontSize);
		
		String fontcolor=text.getCssValue("color");
		System.out.println("Font-Color "+ fontcolor);
		
		String fontfamily=text.getCssValue("font-family");
		System.out.println("Font-Size "+ fontfamily);
		
		String textAlign=text.getCssValue("text-align");
		System.out.println("Text-Align "+ textAlign);
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
	}

}
