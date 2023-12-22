package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		String testdata="google";
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
	}
}
