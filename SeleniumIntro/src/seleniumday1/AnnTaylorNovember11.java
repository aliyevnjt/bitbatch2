package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnnTaylorNovember11 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));
		element.sendKeys("ann taylor" + Keys.ENTER);
		driver.findElement(By.xpath("//cite[@class = 'UdQCqe']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("div[role ='menubar'] *:first-child")).click();
		
		
		String pageName = driver.findElement(By.cssSelector(".page-title")).getText();
		System.out.println(pageName);
		
		String numberOfDresses = driver.findElement(By.cssSelector("div[class = 'pagination-progress active p1'] strong")).getText();
		System.out.println(numberOfDresses);
	
		
		//Thread.sleep(5000);
		//driver.close();
	
	}

}
