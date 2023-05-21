package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Day22 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		  ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver();
		System.out.println("sujiy");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\ScreenShot Selenium\\fb.png");
	
	FileHandler.copy(source, destination);
	}

}
