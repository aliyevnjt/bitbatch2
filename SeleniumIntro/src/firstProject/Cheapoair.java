package firstProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cheapoair {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		String title = driver.getTitle();
		if(title.contains("cheapoair"));
		System.out.println("TITLE IS CORRECT - PASS");
		
		// ROUNDTRIP BUTTON TESTING
		
		System.out.println(driver.findElement(By.id("roundTrip")).isSelected() + " - Rountrip Button is selected by default");
		
		
		// ONE WAY BUTTON TESTING
		
		WebElement oneWayButton = driver.findElement(By.cssSelector("div[class = 'custom-control custom-radio custom-control-inline']:nth-of-type(2)"));
		oneWayButton.click();
				
		WebElement departBox = driver.findElement(By.cssSelector("div[class = 'col-6']"));
		
		
		if (oneWayButton.isEnabled() && departBox.isDisplayed()){
			System.out.println("DEPART BOX - PASS");
		}
		else {
			System.out.println("DEPART BOX - FAIL");
		}
		
		// CALENDAR TESTING
		
		WebElement departButton = driver.findElement(By.cssSelector("div[class = 'form-row calendarDepart'] > *:first-child"));
		departButton.click();
		
		WebElement calendarWindow = driver.findElement(By.className("calendar"));
		
		if (departButton.isEnabled() && calendarWindow.isDisplayed()){
			System.out.println("CALENDAR WINDOW - PASS");
		}
		else {
			System.out.println("CALENDAR WINDOW - FAIL");
		}
		// ADULT PASSENGER BUTTON FUNCTION
		
		WebElement passengerButton = driver.findElement(By.cssSelector("select[name = Adults]"));
		
		Select select = new Select(passengerButton);
		List <WebElement> passengerButtonList = select.getOptions(); 
		System.out.println(passengerButtonList.size());
		if( passengerButtonList.size() >= 10) {
			System.out.println("ADULT PASSENGER BUTTON - PASS");
		}
		else {
			System.out.println("ADULT PASSENGER BUTTON - FAIL");
		}
		
		// CLASS BUTTON FUNCTION
		
		//driver.findElement(By.cssSelector("select[name = Class]")).click();
	
	
		Thread.sleep(3000);
		driver.close();
	}
}
