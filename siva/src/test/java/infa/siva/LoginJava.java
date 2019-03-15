package infa.siva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginJava {

	
	WebDriver driver;
	Properties prop;
@BeforeClass
public void presetup() throws FileNotFoundException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	 driver = new ChromeDriver();	
	 prop = new Properties();
	prop.load(new FileInputStream("Files//Locators.properties"));
}
	
@Test	
public void getMaven() {
	
	driver.get(prop.getProperty("webURL"));
	//driver.findElement(By.linkText("Build Tools")).click();
	driver.findElement(By.id("query")).sendKeys("log4j");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
