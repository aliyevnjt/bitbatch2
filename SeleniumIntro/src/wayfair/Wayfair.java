package wayfair;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wayfair {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cars.com/");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='_1U4gk']//a"));
		System.out.println(list.get(0).getText());
		selectTopMenu(list, "Cars for Sale");
	}
	
	public static void selectTopMenu(List<WebElement> list, String str) {
		for (int i = 0; i < list.size(); i++) {
			if(str.equals(list.get(i).getText())) {
				list.get(i).click();
				break;
			}
		}
	}
}
