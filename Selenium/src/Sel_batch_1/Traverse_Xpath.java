package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traverse_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("(//div/child::ul//li/child::a)[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='details'])[3]/child::h2/following-sibling::div[2]/following-sibling::div/child::div[2]/child::input")).click();
		

	}

}