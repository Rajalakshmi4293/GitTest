package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {
@Test
public void LoginTest() throws IOException{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.flipkart.com/");
	// 2 interface can't be integrated , so using casting
	File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	// apachecommas.io
	FileUtils.copyFile(src,
			new File("C:\\Users\\Chandra Sekhar\\workspace\\sampleGitTest\\Screenshot\\Test.JPG"));
}}