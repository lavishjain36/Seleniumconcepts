import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory","jdk-http-client");
		//instance of chromedriver 
		WebDriver driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://demoqa.com/webtables");
		//locate an element with add button 
		WebElement addButton=driver.findElement(By.id("addNewRecordButton"));
		addButton.click();
		WebElement firstName=driver.findElement(By.id("firstName"));
		firstName.sendKeys("John");
		
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.sendKeys("Doe");
		
		WebElement emailField=driver.findElement(By.id("userEmail"));
		emailField.sendKeys("john@gmail.com");
		
		WebElement ageField=driver.findElement(By.id("age"));
		ageField.sendKeys("38");
		
		WebElement salaryField=driver.findElement(By.id("salary"));
		salaryField.sendKeys("10000");
		
		WebElement departmentField=driver.findElement(By.id("department"));
		departmentField.sendKeys("Development");
		
		WebElement button=driver.findElement(By.id("submit"));
		button.click();		
	}

}
