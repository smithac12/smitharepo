package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smitha Nambiar\\eclipse-workspace\\SeAutomation\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize(); 
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	d.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		d.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("password");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
