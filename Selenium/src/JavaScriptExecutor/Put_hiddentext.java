package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Put_hiddentext {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.skillrary.com/user/login");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('groupcode').value='Akash'");
	//dom page /consol.

}
}