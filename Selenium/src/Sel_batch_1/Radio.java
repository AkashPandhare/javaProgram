package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
}
}