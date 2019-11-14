package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest1 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver(); 	// WebDriver is a public interface, we just define a reference variable(driver)
												// whose type is interface.  Now any object we assign to it must be a instance of
												// class (ChromeDriver) that implement the interface
		
												// driver object(reference variable) of ChromeDriver Class has to implement WebDriver methods
		
		driver.get("https://www.google.com/"); 
		//driver.findElement(By.name("q")).sendKeys("iphone 11" + Keys.ENTER);
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("hello there" + Keys.ENTER);
		
		//driver.close();							// this .close method will close your webapplication.
		
		
	}

}
