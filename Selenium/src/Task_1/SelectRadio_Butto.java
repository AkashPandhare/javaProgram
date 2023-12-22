package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadio_Butto {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html ");
			Thread.sleep(2000);
			
			//validation 1
			driver.findElement(By.xpath("//input[@name='yellow']")).click();
		if( driver.findElement(By.xpath("//input[@name='yellow']")).isSelected())
		{
			System.out.println("yellow radio button selected");
		}
		else {
			System.out.println("yellow radio button has not selected");

		}
		//validation 2
		
			driver.findElement(By.xpath("//input[@name='red']")).click();
			boolean red=driver.findElement(By.xpath("//input[@name='red']")).isSelected();
			if(red) {
				System.out.println("red radio button selected");
			}
			else {
				System.out.println("red radio button not selected");

			}
			//validation3
			boolean d=driver.findElement(By.xpath("//input[@name='dhanbad']")).isSelected();
			if(d) {
				System.out.println("dhanbad radio button selected");

			}else
			{
				System.out.println("dhanbad radio button not selected");

			}
			

	}

}
