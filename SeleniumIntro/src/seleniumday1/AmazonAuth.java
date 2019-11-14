package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAuth {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("ap_email")).sendKeys("today@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("123456");
		
		
//		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Actions actions = new Actions(driver);
		WebElement a = driver.findElement(By.id("column-a"));
		WebElement b = driver.findElement(By.id("column-b"));
		actions.moveToElement(a).clickAndHold().moveToElement(b).release().build().perform();;
		
		
		
	}

}
