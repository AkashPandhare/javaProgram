package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTextMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		Alert  a=driver.switchTo().alert();
	String   get_Text=a.getText();
	System.out.println(get_Text);

	}

}
