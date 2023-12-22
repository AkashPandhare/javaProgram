package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
	public static void main(String[] args) {
		String testdata="google";
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		//driver.get("https://demowebshop.tricentis.com/login");
		String  title=driver.getTitle();
		if(testdata.equalsIgnoreCase(title)) {
			System.out.println("Test case is  pass");

		}
		else {
			System.out.println("Test case is  fail");

		}
		System.out.println("Test data   is a" +testdata);
		System.out.println(title);
	}

}
