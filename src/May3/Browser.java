package May3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
public static WebDriver openBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(o);
	driver.get(url);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	return driver;
}
}
