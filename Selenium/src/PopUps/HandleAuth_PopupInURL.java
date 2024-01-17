package PopUps;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuth_PopupInURL {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
