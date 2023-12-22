package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pandhare");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Pandhare12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aka@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Aka@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
