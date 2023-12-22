package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Login {

	public static void main(String[] args) {
		
		ChromeDriver driver=new   ChromeDriver();
		String Title="Demo  Web Shop. Register";
		driver.get("https://demowebshop.tricentis.com/register");
		
		String title=driver.getTitle();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akash");

		driver.findElement(By.name("LastName")).sendKeys("Pandhare");
		driver.findElement(By.name("Email")).sendKeys("akashpa0123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Akash123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Akash123");
		driver.findElement(By.name("register-button")).click();
			
		driver.findElement(By.className("ico-logout")).click();
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys("akashpa0123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Akash123");
		
		driver.findElement(By.className("login-button")).click();
		
		//link  text
		driver.findElement(By.linkText("Shopping cart")).click();


	}

}
