package Task_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String  title=driver.getTitle();
		System.out.println("Title  of the  page is: "+title);
		driver.close();
	}

}
