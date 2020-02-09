package seleniumday1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeptDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.skyscanner.com/");
		driver.findElement(By.cssSelector("[class = 'BpkButton_bpk-button__2aWRf BpkButton_bpk-button--secondary__tk0TY']")).click();
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.cssSelector("[id = 'culture-selector-locale']")));
		s.selectByIndex(2);
//		System.out.println(driver.findElement(By.id("fsc-origin-search")).getAttribute("type"));
//		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
//		LocalDate ld = LocalDate.now();
//		ld = ld.plusDays(2);
//		System.out.println((ld.getMonth()+"").substring(1).toLowerCase() + " " + ld.getDayOfMonth() + ", " + ld.getYear());
//		String month = (ld.getMonth()+"").substring(1).toLowerCase();
//		String day = ld.getDayOfMonth()<10 ? "0"+ld.getDayOfMonth() : String.valueOf(ld.getDayOfMonth());
//		String year = String.valueOf(ld.getYear());
//		String date = month + " " + day + ", " + year;
//		driver.findElement(By.cssSelector("[aria-label $= '" + date + "']")).click();

	}

}
