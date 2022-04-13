package browsers;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class New {
public static void main(String[] args) throws IOException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		  driver.get("https://www.selenium.dev/downloads/");
		  driver.manage().window().maximize();
		File sd = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		Date dt = new Date();
		   String str = dt.toString();
		   String str1 = str.replace(":", "_");
		   System.out.println(str);
		File bd = new File("./screenshot/"+str1+".png");
		 FileHandler.copy(sd,bd);
}
}

