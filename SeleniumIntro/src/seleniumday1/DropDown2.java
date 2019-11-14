package seleniumday1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//verify title equals to "My Store"
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title = 'Women']")).click();
		WebElement sortBy = driver.findElement(By.id("selectProductSort"));
		Select select = new Select(sortBy);
		select.selectByVisibleText("Product Name: A to Z");
		
		
		List<String>expectedSortByList = new ArrayList<String>(Arrays.asList("--", "Price: Lowest first","Price: Highest first",
				"Product Name: A to Z","Product Name: Z to A", "In stock", "Reference: Lowest first", "Reference: Highest first"));
		
		List <WebElement> sortByList = select.getOptions();
		List<String>actualSortByList = new ArrayList<String>();
		for (WebElement webElement : sortByList) {
			actualSortByList.add(webElement.getText());
			}
		 
		System.out.println(expectedSortByList.equals(actualSortByList));
		
		for (int i =0; i<actualSortByList.size(); i++) {
			System.out.println(actualSortByList.get(i).equals(expectedSortByList.get(i)));
			
			if(!actualSortByList.get(i).equals(expectedSortByList.get(i)))
				System.out.println(actualSortByList.get(i) + " vs " + (expectedSortByList.get(i)));
		}
		
		
		
		
	}
	

}
