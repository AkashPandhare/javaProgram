package IsSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiselectAll {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/SHRUSTI%20CHOUGHULE/OneDrive/Desktop/MultipleSelect.html");
		Select s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		int sz=s.getOptions().size();
		for(int i=0;i<sz;i++) {
			s.selectByIndex(i);
		}
		s.deselectAll();
	}

}
