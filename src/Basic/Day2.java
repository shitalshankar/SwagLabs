package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String l = driver.getTitle();
		System.out.println(l);
		String h = driver.getCurrentUrl();
		System.out.println(h);
		driver.manage().window().minimize();
		Dimension y = new Dimension(500,800);
		driver.manage().window().setSize(y);
		Point p = new Point(700,1200);
		driver.manage().window().setPosition(p);

	}

}
