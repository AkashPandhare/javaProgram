package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass_tab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);//close
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);//allow
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}