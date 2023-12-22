package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerb_By_NameLocator {

	public static void main(String[] args) {
		
		ChromeDriver driver=new   ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Akash");
		driver.findElement(By.name("LastName")).sendKeys("Pandhare");
		driver.findElement(By.name("Email")).sendKeys("aakash12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Akash123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Akash123");
		driver.findElement(By.name("register-button")).click();


		
	}

}
