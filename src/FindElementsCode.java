import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.http.factory","jdk-http-client");
				//instance of chromedriver 
				WebDriver driver=new ChromeDriver();
				//implicitly managing
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				driver.manage().window().maximize();//maxmize the window
//				driver.get("https://the-internet.herokuapp.com/challenging_dom");
//				
//				//finElements
				List<WebElement> rows=driver.findElements(By.tagName("tr"));
				
				
				
				//Print the total no of rows
//				int count=Field.size()-1;
				
//				if(count==10) {
//					System.out.println("Total Number of rows "+ count);
//				}else {
//					System.out.println("No. of rows are not matching");
//
//				}
				
//				Iterate using iterator over all elements
				
				Iterator<WebElement> itr=rows.iterator();
				
				//check if there is element or not
				while(itr.hasNext()) {
					//iterate one element by one
					WebElement item=itr.next();
					
					//get text of item
					String label=item.getText();
					
					System.out.println("Details: "+ label);
				}
	}

}
