package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smitha Nambiar\\eclipse-workspace\\SeAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Besant");
		driver.findElement(By.name("lastname")).sendKeys("Tech");
		Select s = new Select(driver.findElement(By.name("birthday_day")));
		Select s1 = new Select(driver.findElement(By.name("birthday_month")));
		Select s2 = new Select(driver.findElement(By.name("birthday_year")));
		
		s.selectByValue("3");
		s1.selectByVisibleText("Mar");
		s2.selectByIndex(3);
		
	//	driver.close();
	}

}
