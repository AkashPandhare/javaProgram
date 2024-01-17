package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		driver.findElement(By.xpath("//a[@class='cd-popup-trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cd-popup-close img-replace']")).click();
}
}