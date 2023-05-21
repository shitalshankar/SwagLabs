package May3;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookTest {
	WebDriver driver ;
@BeforeMethod
public void launchBrowser() {
	driver= Browser.openBrowser("https://www.facebook.com/");
	
}
@Test
public void loginWithCredentials() {
	FacebookPage fb = new FacebookPage(driver);
	//fb.clickOnSignUp();
	//fb.enterFirstName("Shital", driver);
	
	fb.enteremail("shitalmeshram@gmail.com");
	fb.enterpassword("456789123");
	fb.clickLogin();
	String Expectedurl = "https://www.facebook.com/";
	String Actualurl = driver.getCurrentUrl();
	//Assert.assertEquals(Actualurl, Expectedurl); //Hard Assert
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(Actualurl, Expectedurl);
	sa.assertAll();//Soft Assert
	
}
/*@Test
public void withoutEmail() {
	FacebookPage fb = new FacebookPage(driver);
	fb.enterpassword("456789123");
	fb.clickLogin();
	
}
@Test
public void withoutPassword() {
	FacebookPage fb = new FacebookPage(driver);
	fb.enteremail("shitalmeshram@gmail.com");
	fb.clickLogin();
	
}
@AfterMethod

public void closeBrowser() {
	driver.close();
}*/
}
