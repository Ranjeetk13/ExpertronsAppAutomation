package Appin;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class expertronApp
{

	MobileDriver<MobileElement> dr;
	
	public static void main(String[] args) throws MalformedURLException
	{
		
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
            cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

            cap.setCapability(MobileCapabilityType.APP, "D:\\app-prod-release (8).apk");
       
            URL url = new URL ("http://127.0.0.1:4723/wd/hub");
            cap.setCapability("autoGrantPermissions", "true");
            AndroidDriver<MobileElement> dr=new AndroidDriver<MobileElement> (url,cap);
 
 

            dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            dr.findElement(By.xpath("//android.widget.TextView[@text='Continue as a Guest']")).click();
            
            dr.findElement(By.xpath("//android.widget.TextView[@text='Graduation']")).click();
            dr.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
            
           // dr.close();
            
            //Comment one

	}

}
