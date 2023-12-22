package Sel_batch_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Closebrowser {

		public static void main(String[] args)  {
			
			ChromeDriver driver=new  ChromeDriver();
		///	Thread.sleep(2000);   throws exeception
			driver.close();
		}
}
