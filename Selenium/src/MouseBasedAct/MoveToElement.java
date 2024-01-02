package MouseBasedAct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		Actions  a=new  Actions(driver);
		a.moveToElement(computer).build().perform();
	}

}
