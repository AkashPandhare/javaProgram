package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String  tag=driver.findElement(By.className("search-box-text")).getTagName();
		System.out.println(tag);


	}

}
