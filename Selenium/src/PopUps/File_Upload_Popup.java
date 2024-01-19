package PopUps;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload_Popup {
public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement upload_resume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(upload_resume).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SHRUSTI CHOUGHULE\\Downloads\\Akash's Resume (1).pdf");
}
}