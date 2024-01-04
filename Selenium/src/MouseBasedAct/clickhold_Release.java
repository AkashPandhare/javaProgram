package MouseBasedAct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickhold_Release {
	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 	
		WebElement capital=driver.findElement(By.id("box3"));
		WebElement country=driver.findElement(By.id("box103"));
		WebElement capital2=driver.findElement(By.id("box6"));
		WebElement country2=driver.findElement(By.id("box106"));
	Actions a=new Actions(driver);
	
	a.moveToElement(capital).clickAndHold().moveToElement(country).release().build().perform();
	a.moveToElement(capital2).clickAndHold().moveToElement(country2).release().build().perform();
	}
}