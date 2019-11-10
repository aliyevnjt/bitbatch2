package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	/**
	 * Test Case: Casual Dresses
	 * Test Steps:
	 * 		- Go to the website http://automationpractice.com/index.php
	 * 		- Verify Title equals to "My Store"
	 * 		- Click on WOMEN top menu
	 * 		- Click on Dresses
	 * 		- Click on Casual Dresses
	 * 		- Verify expected result equals There is 1 product.
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//Verify Title equals to "My Store"
		System.out.println(driver.getTitle());
		//Click on WOMEN top menu
		driver.findElement(By.cssSelector("a[title = 'Women']")).click();
		//Click on Dresses
		driver.findElement(By.cssSelector("ul[class= 'tree dynamized'] > li:nth-child(2) a:nth-child(2)")).click();
		//Click on Casual Dresses
		driver.findElement(By.cssSelector(".block_content ul[class= 'tree dynamized']>*:first-child a")).click();
		//Verify expected result equals There is 1 product.
		String counter = driver.findElement(By.cssSelector(".heading-counter")).getText();
		System.out.println(counter);
		//BREAK UNTIL 9.26 AM
		
		//driver.close();
	}
}
