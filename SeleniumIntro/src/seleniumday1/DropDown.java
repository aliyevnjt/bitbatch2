package seleniumday1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//verify title equals to "My Store"
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title = 'Women']")).click();
		
		WebElement sortBy = driver.findElement(By.id("selectProductSort")); // 1.	get element for drop-down menu
		Select select = new Select(sortBy);									// 2.	create Select Class & put element in the constructor
		select.selectByVisibleText("Price: Highest first");					// 3. 	use drop-down menu with select class methods
		
		List <WebElement> sortByList = select.getOptions();  				// 4.	assign drop-down menu items to WebElement list 
		for (WebElement webElement : sortByList) {							// 5.	using for-each loop print out each item from the 
			System.out.println(webElement.getText());						//		WebElement list
		}
	}
}
