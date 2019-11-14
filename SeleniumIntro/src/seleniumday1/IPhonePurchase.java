package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhonePurchase {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));
		element.sendKeys(("iphone" + Keys.ENTER));
		String stats = driver.findElement(By.id("resultStats")).getText();
		System.out.println(stats);
		
		
//		Thread.sleep(3000);
//		driver.close();
		
		if(stats.contains("About")) {
			System.out.println("PASS");
		}
		else System.out.println("FAIL");
		
		//driver.findElement(By.xpath("//img[@src = '/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png']")).click();
		driver.findElement(By.id("logo")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class = 'LC20lb']")).click();
		driver.findElement(By.xpath("//figure[@class = 'chapternav-icon']")).click();
		driver.findElement(By.className("ac-ln-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
