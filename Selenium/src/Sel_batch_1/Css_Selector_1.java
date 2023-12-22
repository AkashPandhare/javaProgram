package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_1 {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Pandhare");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("AkashP@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='register-button']")).click();

	}

}
