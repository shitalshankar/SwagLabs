package Basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithTime {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Parent.OpenBrowser("https://vctcpune.com/about-us");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String value = date.format(time);
	File destination = new File("C:\\ScreenShot Selenium\\"+"Vctc"+"-"+value+".jpg");
	FileHandler.copy(source, destination);
		
	}

}
