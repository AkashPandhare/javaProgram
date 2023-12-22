package Task_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_3 {

		public static void main(String[] args) {
					ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String  url=driver.getCurrentUrl();
			String sourcecode=driver.getPageSource();
			System.out.println(sourcecode);
			System.out.println("URL of the  page is:"+url);

			driver.close();

}
}