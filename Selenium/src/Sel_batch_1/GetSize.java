package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size=driver.findElement(By.id("small-searchterms")).getSize();
		
		int height=size.getHeight();
		int width=size.getWidth();
		
		System.out.println(height);
		System.out.println(width);

	}

}
