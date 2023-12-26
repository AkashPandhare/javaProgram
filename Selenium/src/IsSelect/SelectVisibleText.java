package IsSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectVisibleText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new  ChromeDriver();
		driver.get("file:///C:/Users/SHRUSTI%20CHOUGHULE/OneDrive/Desktop/MultipleSelect.html");
		WebElement drop=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(drop);
		
		if(s.isMultiple()) {
			System.out.println("IS  a  multiselect");
			
			s.selectByVisibleText("Russia");
			Thread.sleep(2000);
			
			s.deselectByVisibleText("Russia");
			Thread.sleep(2000);

		}
		else {
			System.out.println("IS  a  Sinngle select");

		}

	}

}
