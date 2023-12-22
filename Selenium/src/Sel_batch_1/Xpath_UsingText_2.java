package Sel_batch_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_UsingText_2 {

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
