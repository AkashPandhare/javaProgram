package Alerts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import zmq.ZError.IOException;

public class ScreenShot {
	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search_field=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		File from=search_field.getScreenshotAs(OutputType.FILE);
		
		File to =new File("./Screenshots/element.png");
		
	
			try {
				FileHandler.copy(from, to);
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}


