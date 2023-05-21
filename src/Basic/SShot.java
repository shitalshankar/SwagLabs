package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Parent.OpenBrowser("https://vctcpune.com/about-us");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\ScreenShot Selenium\\vctc.png");
		FileHandler.copy(source, destination);
	}

}
