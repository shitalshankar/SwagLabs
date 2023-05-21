package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PageMax {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co);
driver.get("https://mail.google.com/mail/u/4/#inbox");
String title = driver.getTitle();
System.out.println(title);
driver.manage().window().maximize();
String curtitle = driver.getCurrentUrl();
System.out.println(curtitle);
driver.manage().window().minimize();
driver.close();

}

}
