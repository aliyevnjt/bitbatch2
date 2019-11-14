package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice1 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//verify title equals to "My Store"
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//a[@title = 'Women']")).click();
		driver.findElement(By.cssSelector("a[title = 'Women'])")).click(); 
		
		
		//this is how you get third one of the same link in xpath
		//(//a[@href = 'http://automationpractice.com/index.php?id_category=8&controller=category'])[3]
		
		
		
		driver.findElement(By.cssSelector("ul[class= 'tree dynamized'] > li:nth-child(2) a:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".block_content ul[class= 'tree dynamized']>*:first-child a")).click();
		String counter =driver.findElement(By.cssSelector(".heading-counter")).getText();
		System.out.println(counter);
//		
//		
//	
//		Thread.sleep(3000);
//		driver.close();
//		
	}
}
