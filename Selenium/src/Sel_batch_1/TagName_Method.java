package Sel_batch_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Method {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement>alllink=driver.findElements(By.tagName("a"));
		for(WebElement  e:alllink) {
			System.out.println(e.getText());
			
			//getAttribute
			
			
		}
	}

}
