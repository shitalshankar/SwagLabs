package Basic;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String d = driver.getTitle();
		System.out.println(d);
		
		String f = driver.getCurrentUrl();
		System.out.println(f);
		
		driver.manage().window().minimize();
		
		Dimension g = new Dimension(400, 600);
		driver.manage().window().setSize(g);
		
		Point p = new Point(500,700);
		driver.manage().window().setPosition(p);
		
	}

}
