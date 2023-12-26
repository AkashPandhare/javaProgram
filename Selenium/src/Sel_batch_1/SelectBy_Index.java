package Sel_batch_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy_Index {

	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		
	WebElement  drop=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new  Select(drop);
		s.selectByIndex(2);
		
		WebElement  drop1=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select  s1=new  Select(drop1);
		s1.selectByIndex(3);
		
		WebElement  drop3=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select s2=new  Select(drop3);
		s2.selectByIndex(1);
	}

}
