package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_UsigTest_3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(//input[text()='Books']);
				//driver.findElement(By.xpath("//[text()='Register']")).click();
				Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='ico-login']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='cart-label']")).click();


	}
}
