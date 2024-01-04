package MouseBasedAct;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickwebelement {

	public static void main(String[] args) {
		
			ChromeDriver driver=new  ChromeDriver();
			driver.get("https://demowebshop.tricentis.com");
			Actions a=new Actions(driver);
			a.click(driver.findElement(By.xpath("//a[text()='Register']"))).perform();

	}

}
