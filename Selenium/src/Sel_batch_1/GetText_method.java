package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_method {

	public static void main(String[] args) {
		ChromeDriver driver=new   ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("akashpa0123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Akash123");
		driver.findElement(By.className("login-button")).click();
		
		

	}

}
