package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new  ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.close();
	}
}
