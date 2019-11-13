package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ValeriuChirica/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("blender");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']//span[@dir='auto']")).click();
		// driver.findElement(By.id("buy-now-button")).click();
		// driver.findElement(By.id("ap_email")).sendKeys("chiricavalera.com");
		driver.findElement(By.id("add-to-cart-button")).click();
		// driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("attachSiNoCoverage-announce")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("attach-view-cart-button-form")).click();
		String driv = driver.findElement(By.xpath(
				"//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']"))
				.getText();
		driver.close();

		String driv1 = driv.substring(1);
		System.out.println(driv);
		Double i = Double.parseDouble(driv1);
		price(i);

	}

	public static Double price(double p) {
		if (p <=40)
			System.out.println("It's a good price");
		else
			System.out.println("This price is too high.");
		return p;
	}
// Hello I'm testing the git
}
