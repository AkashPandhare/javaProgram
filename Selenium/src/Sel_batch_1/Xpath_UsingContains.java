package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_UsingContains {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[contains(text(),'Books']")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'computers']")).click();)

	}

}