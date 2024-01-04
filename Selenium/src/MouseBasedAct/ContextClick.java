package MouseBasedAct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
		public static void main(String[] args) {
			ChromeDriver driver=new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Actions  a=new  Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).click(driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/child::li/child::span[1]"))).perform();

}
}