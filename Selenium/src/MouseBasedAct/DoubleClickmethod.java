package MouseBasedAct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickmethod {

	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions  a=new  Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).doubleClick().perform();
		
		Alert  a1=driver.switchTo().alert();
		System.out.print(a1.getText());
		a1.accept();
		

	}

}
