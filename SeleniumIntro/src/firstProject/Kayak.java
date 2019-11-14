package firstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kayak {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		if(title.contains("kayak"));
		System.out.println("TITLE IS CORRECT - PASS");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class= 'keel-grid _jrC _jrD _jrE _joR _joS _jrB']//a"));
		System.out.println(list.size());
		System.out.println(list.get(3).getText());
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}

}
