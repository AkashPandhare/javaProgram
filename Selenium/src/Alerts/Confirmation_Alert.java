package Alerts;
//package
//hello program
//NEW
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Alert  a1=driver.switchTo().alert();
		//a.accept();  //click OK
		a1.dismiss();   //Click  cancel 
		//a.getText();
}
}