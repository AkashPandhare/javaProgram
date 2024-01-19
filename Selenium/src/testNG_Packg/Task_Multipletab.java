package testNG_Packg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task_Multipletab {
	@Test(invocationCount=2)
	public void fb() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=-1,invocationCount=3)
	public void instagram() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
	}

}
