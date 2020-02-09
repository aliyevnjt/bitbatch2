package seleniumday1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeptDates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bostonivytech/Documents/chromefolde/qwe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.skyscanner.com/");
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		List<WebElement> actualDeptMonths = driver.findElements(
				By.cssSelector("#depart-calendar__bpk_calendar_nav_select option"));
		System.out.println(actualDeptMonths.size());
		List<String> actualDeptMonthsText = new ArrayList<String>();
		actualDeptMonthsText = getText(actualDeptMonths);
		LocalDate ld = LocalDate.now();
		List<String> expectedDeptMonths = new ArrayList<String>();
		for (int i = 0; i < 13; i++) {
			String month = String.valueOf(ld.plusMonths(i).getMonth());
			String year = String.valueOf(ld.plusMonths(i).getYear());
			month = month.substring(0, 1) + month.substring(1,month.length()).toLowerCase();
			expectedDeptMonths.add(month + " " + year);
			//System.out.println(month + " " + year);
		}
		boolean flag = true;
		for (int i = 0; i < expectedDeptMonths.size(); i++) {
			if(!expectedDeptMonths.get(i).equals(actualDeptMonthsText.get(i))) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("PASS");
		}else
			System.out.println("FAIL");
		
		// BREAK UNTIL 9.25 PM
	}
	
	public static List<String> getText(List<WebElement> list) {
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			list1.add(list.get(i).getText());
		}
		return list1;
	}

}
