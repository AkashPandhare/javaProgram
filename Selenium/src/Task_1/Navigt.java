package Task_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigt {
	public static void main(String  args) throws InterruptedException {
		ChromeDriver  driver=new ChromeDriver();
		//navigate 
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
