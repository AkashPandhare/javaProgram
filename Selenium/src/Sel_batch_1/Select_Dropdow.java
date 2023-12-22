package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdow {
	public static void  main(String args) {
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		
	WebElement drop=	driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select  s=new  Select(drop);
	s.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=10");
	
	WebElement drop1=	driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	Select  s1=new  Select(drop1);
	s.selectByValue("value=\"https://demowebshop.tricentis.com/digital-downloads?pagesize=12");
	}

}
