package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smitha Nambiar\\eclipse-workspace\\SeAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/WebApplication/iframe.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.switchTo().frame("iframe_b"); //switch to iframe page
		driver.findElement(By.name("a")).sendKeys("Besant");
		driver.switchTo().defaultContent(); //switchback to default page
		driver.findElement(By.name("a")).sendKeys("XYZ");
		
	}

}
