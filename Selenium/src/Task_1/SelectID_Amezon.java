package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectID_Amezon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	WebElement drop=driver.findElement(By.xpath("////a[@class='a-dropdown-link a-active']"));
	Select s=new   Select(drop);
	s.selectByIndex(3);
	}

}
