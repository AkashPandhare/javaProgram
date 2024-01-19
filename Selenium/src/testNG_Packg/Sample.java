package testNG_Packg;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Sample {
	
@Test
public void logintest() {

	ChromeDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']"));
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("akkp@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Akash@12345");
	
}
}
