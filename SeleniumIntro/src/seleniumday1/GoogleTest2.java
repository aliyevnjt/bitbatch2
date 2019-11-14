package seleniumday1;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest2 {
	public static void main(String[] args) throws InterruptedException { 
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("iphone 11" + Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		
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
		
		long l = toLong(stats);
		System.out.println(l);
		
//		String [] arr = stats.split(" ");
//		System.out.println(Arrays.toString(arr));
//		String str = arr[1].replace(",", "");
//		System.out.println(str);
//		System.out.println(Long.parseLong(str) >= 400000000);
				
	}
	public static long toLong (String str) {
		String [] arr = str.split(" ");
		String str1 = arr[1].replace(",", "");
		return Long.parseLong(str1);
	}
	
}

