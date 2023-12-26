package IsSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptio {

	public static void main(String[] args) {
		
		ChromeDriver driver=new  ChromeDriver();
		driver.get("file:///C:/Users/SHRUSTI%20CHOUGHULE/OneDrive/Desktop/MultipleSelect.html");
		WebElement drop=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(drop);
		List<WebElement>all=s.getOptions();
		
		for(WebElement  Element  : all) {
			System.out.println(Element.getText());

		}
		
	}

}
