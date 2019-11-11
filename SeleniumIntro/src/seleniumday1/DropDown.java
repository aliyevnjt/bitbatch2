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
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// Verify Title equals to "My Store"
		System.out.println(driver.getTitle());
		// Click on WOMEN top menu
		driver.findElement(By.cssSelector("a[title = 'Women']")).click();
		WebElement sortBy = driver.findElement(By.id("selectProductSort"));
		Select select = new Select(sortBy);
		//select.selectByVisibleText("In stock");
		List<String> expectedSortByList = new ArrayList<String>(Arrays.asList("--","Price: Lowest first",
				"Price: Highest firs", "Product Name: A to Z", "Product Name: Z to A", "In stock",
				"Reference: Lowest first","Reference: Highest first"));
		
		
		
		List<WebElement> sortByList = select.getOptions();
		List<String> actualSortByList = new ArrayList<String>();
		
		for (WebElement webElement : sortByList) {
			actualSortByList.add(webElement.getText());
		}
		
		for (int i = 0; i < actualSortByList.size(); i++) {
			System.out.println(actualSortByList.get(i).equals(expectedSortByList.get(i)));
			if(!actualSortByList.get(i).equals(expectedSortByList.get(i)))
				System.out.println(actualSortByList.get(i) + " vs " + expectedSortByList.get(i));
		}
	}
}
