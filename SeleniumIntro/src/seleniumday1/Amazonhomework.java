package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonhomework {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("diapers size 1" + Keys.ENTER);
		driver.findElement(By.xpath("//img[@src = 'https://m.media-amazon.com/images/I/611mTJ5EK4L._AC_UL320_ML3_.jpg']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		WebElement total = driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign']"));
		System.out.println("diaper total cost is " + total.getText());
		
		
		
		
		
		
		
	}
	
	

}
