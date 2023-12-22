package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
	ChromeDriver   driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement search_textfield=driver.findElement(By.id("small-searchterms"));
	WebElement search_button=driver.findElement(By.className("search-box-button"));
	
	if(search_textfield.isDisplayed()) {
		System.out.println("Serach field text is present");

		search_textfield.sendKeys("earpods");
		search_button.click();
	}
	else {
		System.out.println("Serach field text not present");
	}
	}

}
