package MouseBasedAct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pattern_DrapandDrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement alpha_A=driver.findElement(By.xpath("//li[text()='A']"));
		
		List<WebElement> all=driver.findElements(By.xpath("//li[@class='ui-state-default']"));
		
		int size=all.size();
		Actions a=new Actions(driver);
		
		for(int i=0;i<size;i++) {
			Thread.sleep(1000);
			a.dragAndDrop(driver.findElement(By.xpath("(//li[@class='ui-state-default'])[12]")), alpha_A).perform();
		}
	}

}
