package org.BaseClassProperties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

	public WebDriver driver;
	
	public BaseClass(WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver setupDriver()
	{
		String browser = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",browser);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		driver = new ChromeDriver(cap);
		
		driver.get("https://dog.ceo/dog-api/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, this);
		
		return driver;
		
	}
	
	
	
	public void killChromeBrowser()throws Exception
	{
		Runtime.getRuntime().exec("taskkill /f /im chrome.exe");
	}
	
	public String readProperty(String propertyName)throws Exception
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		prop.load(fis);
		
		return prop.getProperty(propertyName);
		
	}
	
	
}
