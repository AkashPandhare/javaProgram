package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator_1click {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(11000);
		WebElement  Loginbutton=driver.findElement(By.id("loginBtn"));
		Loginbutton.click();
		WebElement searchusername=	driver.findElement(By.id("Email"));
		
		searchusername.sendKeys("Shrusti");
		
		WebElement searchpass=	driver.findElement(By.id("Password"));
		
		searchpass.sendKeys("Akash");

}
}