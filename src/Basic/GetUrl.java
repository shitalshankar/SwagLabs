package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		//driver.get("https://www.facebook.com/");
//Navigation nav = driver.navigate();
//nav.to("https://www.facebook.com/");

		driver.navigate().to("https://www.facebook.com/");
Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
	}

}
