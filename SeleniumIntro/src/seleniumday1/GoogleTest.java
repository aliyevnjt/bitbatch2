package seleniumday1;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		element.sendKeys("iphone" + Keys.ENTER);
		String stats = driver.findElement(By.id("resultStats")).getText();
		System.out.println(stats);
		if(stats.contains("About")) {
			System.out.println("PASS");
		}
		else System.out.println("FAIL");
		
//		Long l = toLong(stats);
//		System.out.println(l);
		driver.findElement(By.id("logo")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@class = 'FPdoLc VlcLAe']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//a[@href = 'https://www.apple.com/iphone/']")).click();
		driver.findElement(By.cssSelector("[href ='/iphone-11-pro/'] [class = 'chapternav-label']")).click();
		driver.findElement(By.cssSelector("[href = '/us/shop/goto/buy_iphone/iphone_11_pro']")).click();
		Thread.sleep(2000);
		//driver.close();
		
		// comment: Nijat
		
	}
	
	public static long toLong(String str) {
		String [] arr = str.split(" ");
		String str1 = arr[1].replace(",", "");
		return Long.parseLong(str1);
	}
	
	
}
