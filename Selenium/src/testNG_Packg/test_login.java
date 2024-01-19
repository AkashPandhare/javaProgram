package testNG_Packg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class test_login {
	@Test(priority=1)
	public void register() {
		Reporter.log("Register successfully",true);
	}
	@Test(priority=2)
	public void login(){
		Reporter.log("Login success",true);
		
	}
	@Test(priority=3)
	public void logout() {
		Reporter.log("Logout success",true);
	}
}
