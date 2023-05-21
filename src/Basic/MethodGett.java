package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MethodGett {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		String p =driver.getTitle();
		System.out.println(p);
		String o = driver.getCurrentUrl();
		System.out.println(o);
		driver.close();
		
	}

}
