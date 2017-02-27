package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestWebApp {

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
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Appium !!!!");
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
