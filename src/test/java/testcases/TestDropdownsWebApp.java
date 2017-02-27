package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class TestDropdownsWebApp {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("deviceName", "HUAWEI CUM-L21");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platform", "Android");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);		
		driver.manage().timeouts().implicitlyWait(10L,  TimeUnit.SECONDS);
		
		driver.get("http://wikipedia.org");
		
		WebElement dropdown =  driver.findElement(By.id("searchLanguage"));
		new Select(dropdown).selectByValue("hi");
		
		List<WebElement> options =  dropdown.findElements(By.tagName("option"));
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
