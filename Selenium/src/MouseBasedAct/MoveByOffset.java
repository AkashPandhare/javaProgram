package MouseBasedAct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
	

	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Point loc=driver.findElement(By.xpath("//input[@id='small-searchterms']")).getLocation();
		
		int x=loc.getX();
		int y=loc.getY();
		
		Rectangle loc1=driver.findElement(By.xpath("//input[@id='small-searchterms']")).getRect();
		
		int x1=loc1.getX();
		int y1=loc1.getY();
		
		Actions a=new Actions(driver);
		
		a.moveByOffset(x1, y1).click().sendKeys("Mobiles").perform();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x1);
		System.out.println(y1);;
		
	}

}


