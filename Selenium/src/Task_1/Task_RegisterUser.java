package Task_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_RegisterUser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		

		 driver.findElement(By.xpath("//input[@data-id='first_name']")).sendKeys("Akash");

		 driver.findElement(By.xpath("//input[@data-id='last_name']")).sendKeys("Pandhare");

		 driver.findElement(By.xpath("//input[@data-id='user_email']")).sendKeys("akash@gmail.com");

		 driver.findElement(By.xpath("//input[@data-id='user_pass']")).sendKeys("AAkash*111");

		 driver.findElement(By.xpath("//input[@data-id='radio_1665627729']")).click();

		 driver.findElement(By.xpath("//input[@data-id='date_box_1665628538']")).click();

		 driver.findElement(By.xpath("//span[@aria-label='December 1, 2023']")).click();


		 driver.findElement(By.xpath("//input[@data-id='input_box_1665629217']")).sendKeys("IND");

		 driver.findElement(By.xpath("//input[@data-id='phone_1665627880']")).sendKeys("+91 123123123");
		 driver.findElement(By.xpath("//select[@data-id='country_1665629257']")).click();


		 driver.findElement(By.xpath("//option[@value='IN']")).click();

		 driver.findElement(By.xpath("//input[@data-id='phone_1665627865']")).sendKeys("9999999999");

		 driver.findElement(By.xpath("//input[@data-id='date_box_1665629845']")).click();

		 driver.findElement(By.xpath("(//span[@class='flatpickr-next-month'])[2]")).click();//click next month.
		 driver.findElement(By.xpath("(//span[@aria-label='January 1, 2024'])[2]")).click();//Select 1jan 2024 dats


		 driver.findElement(By.xpath("//input[@data-id='number_box_1665629930']")).sendKeys("5");


		 driver.findElement(By.xpath("//input[@data-id='input_box_1665630010']")).sendKeys("2");


		 driver.findElement(By.xpath("//textarea[@data-id='textarea_1665630078']")).sendKeys("QA");

		 }



		}
