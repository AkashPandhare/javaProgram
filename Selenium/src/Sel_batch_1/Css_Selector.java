package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		///driver.findElement(By.cssSelector("input[type='text']")).sendKeys("moile");
		
		//for ID locator  onnly   we   use #
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("charger");
		
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();

	}

}
