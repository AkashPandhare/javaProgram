package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class printurl {
	public static void main(String[] args) {
		String testdata="google";
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		String  title=driver.getTitle();
		String  url=driver.getCurrentUrl();
		if(testdata.equalsIgnoreCase(title)) {
			System.out.println("Test case is  pass");

		}
		else {
			System.out.println("Test case is  fail");

		
		System.out.println(url);
}
}
}	