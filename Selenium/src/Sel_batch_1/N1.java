package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class N1 {
	public static void main(String[] args) throws InterruptedException {
		String testdata="google";
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Test");
		Thread.sleep(2000);

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}