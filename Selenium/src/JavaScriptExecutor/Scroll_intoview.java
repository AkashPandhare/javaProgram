package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_intoview {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element1=driver.findElement(By.xpath("//Strong[text()='Featured products']"));
		
		WebElement element2=driver.findElement(By.xpath("//h3[text()='Customer service']"));
		//scroll cursor till element finds
		js.executeScript("arguments[1].scrollIntoView(true);",element1,element2);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);",element1,element2);

}
}