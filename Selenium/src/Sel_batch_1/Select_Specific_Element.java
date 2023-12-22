package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Specific_Element {

	public static void main(String[] args) {

			ChromeDriver   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
			driver.findElement(By.xpath("//input[@value='Add to cart'])[2]")).click();
			
			driver.findElement(By.xpath("//a[@class=cart-label']")).click();
			
			
	}

}
