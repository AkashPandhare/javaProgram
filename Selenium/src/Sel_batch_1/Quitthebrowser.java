package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quitthebrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new  ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/login");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
