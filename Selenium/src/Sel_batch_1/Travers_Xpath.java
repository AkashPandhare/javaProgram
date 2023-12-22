package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travers_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//[@href='digital-downloads']")).click();
	}

}
//h1[text()='Digital downloads']/parent::div/following-sibling::div/child::div[3]/child::div[2]/child::div/child::div[2]/child::h2/following-sibling::div[3]/child::div[2]/child::input