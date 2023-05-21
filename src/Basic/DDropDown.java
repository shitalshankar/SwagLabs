package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDropDown {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\chromedriver_win32\\chromedriver.exe"); ChromeOptions co = new
		 * ChromeOptions(); co.addArguments("--remote-allow-origins=*"); WebDriver
		 * driver = new ChromeDriver(co); driver.get(
		 * "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 * driver.manage().window().maximize(); WebElement op =
		 * driver.findElement(By.xpath("//select[@id='animals']")); op.click(); Select
		 * lp = new Select(op); lp.selectByIndex(3); Thread.sleep(2000); driver.close();
		 */
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
		
		
		
	}

}
