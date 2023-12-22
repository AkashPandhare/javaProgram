package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_2 {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
	boolean	search_textField=driver.findElement(By.id("small-searchterms")).isDisplayed();
	
	if(search_textField) {
		System.out.println("Serach field text is present");
	}
	else {
		System.out.println("Serach field text is not present");

	}
	}

}
