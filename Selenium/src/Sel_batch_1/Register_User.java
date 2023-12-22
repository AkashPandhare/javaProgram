package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_User {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement gender=driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.id("FirstName"));
			
			firstname.sendKeys("Akash");
			Thread.sleep(2000);
			
			WebElement lastname=driver.findElement(By.id("LastName"));
			lastname.sendKeys("Pandhare");
			Thread.sleep(2000);
			
			WebElement email=driver.findElement(By.id("Email"));
			email.sendKeys("Pandhare1@gmail.com");
			Thread.sleep(2000);
			
			WebElement password=driver.findElement(By.id("Password"));
			password.sendKeys("12345678");
			Thread.sleep(2000);
			
			
			
			WebElement Connpassword=driver.findElement(By.id("ConfirmPassword"));
			Connpassword.sendKeys("12345678");
			Thread.sleep(2000);
			
			WebElement register=driver.findElement(By.id("register-button"));
			register.click();
	}

}
