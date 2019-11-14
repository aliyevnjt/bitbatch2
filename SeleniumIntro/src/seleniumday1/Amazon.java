package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emine\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("diapers size 2" + Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/613OqJ2qYML._AC_UL320_ML3_.jpg']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		WebElement element1 = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']"));
		System.out.println(element1.getText());
		
		
	}

}
