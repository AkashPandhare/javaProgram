package MouseBasedAct;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Actions  a=new   Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Register']"))).click().perform();
	}

}
