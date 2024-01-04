package MouseBasedAct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_Click=driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement>all = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/child::li/child::span[1]"));
		Actions  a=new  Actions(driver);
		
		for (WebElement Element : all) {
		a.contextClick(right_Click).click(Element).build().perform();
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			a1.accept();
			
		}
		
}
}