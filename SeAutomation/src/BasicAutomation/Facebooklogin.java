package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smitha Nambiar\\eclipse-workspace\\SeAutomation\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize(); // maximize the window
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
	//	d.findElement(By.name("email")).sendKeys("smithacn");
	//	d.findElement(By.name("pass")).sendKeys("1234");
	//	d.findElement(By.xpath("//input[@id='email']")).sendKeys("smithacn"); //relative xpath reference
	//	d.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
	//	d.findElement(By.linkText("Forgotten account?")).click();
	//	d.findElement(By.xpath("//a[text()='Forgotten account?']")).click();//incase of a link, input has to be replaced by a and text() should be used
	//	d.findElement(By.id("u_0_9")).click();
		d.findElement(By.xpath("//input[@id='u_0_9']")).click();
		//	d.findElement(By.id("u_0_2")).click(); // this is for clicking on the login button. 
		
	}

}
