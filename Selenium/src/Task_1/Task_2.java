package Task_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {
	public static void main(String[] args) {
		String  testdata ="Facebook";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Title=driver.getTitle();
		if(Title.contains(testdata)) {
			System.out.println("Test case is  pass");

		}
		else {
			System.out.println("Test case is  fail");
}
		System.out.println("Title of the page is"+Title);
	}
}