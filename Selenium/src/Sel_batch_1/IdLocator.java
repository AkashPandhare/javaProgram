package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	WebElement searchField=	driver.findElement(By.id("small-searchterms"));
	
	searchField.sendKeys("Shrusti");
	}

}
