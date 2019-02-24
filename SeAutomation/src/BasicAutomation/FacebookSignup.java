package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smitha Nambiar\\eclipse-workspace\\SeAutomation\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize(); // maximize the window
		d.get("https://www.facebook.com");
		
		d.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Abcdef");
		d.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Nee");
		d.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("2134567891");
		d.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("password12");
		Select s = new Select(d.findElement(By.name("birthday_day")));
		Select s1 = new Select(d.findElement(By.name("birthday_month")));
		Select s2 = new Select(d.findElement(By.name("birthday_year")));
		
		s.selectByValue("3");
		s1.selectByVisibleText("Mar");
		s2.selectByIndex(12);
		d.findElement(By.xpath("//input[@id='u_0_9']")).click();
		d.findElement(By.xpath("//button[@id='u_0_11']")).click();
	}

}
