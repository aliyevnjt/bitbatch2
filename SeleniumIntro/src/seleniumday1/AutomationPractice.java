package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
        WebDriver driver =  new ChromeDriver();
       

		
	}
}
