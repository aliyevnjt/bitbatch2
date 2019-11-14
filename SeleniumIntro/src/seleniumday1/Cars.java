package seleniumday1;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cars {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cars.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class ='_1U4gk']//a"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());
		
		//selectTopMenu(list, "Sell Your Car");	
		
		
		Thread.sleep(3000);
		driver.close();
	}

	public static void selectTopMenu(List<WebElement> list, String str){
		for (int i = 0; i<list.size(); i++) {
			if(str.equals(list.get(i).getText())) {
				list.get(i).click();
			}
		}
	}	
}
		//System.out.println(list.get(0).getText());