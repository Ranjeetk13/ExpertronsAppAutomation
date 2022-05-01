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
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
            cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

            cap.setCapability(MobileCapabilityType.APP, "D:\\app-beta-release (107).apk");
       
            URL url = new URL ("http://127.0.0.1:4723/wd/hub");
            cap.setCapability("autoGrantPermissions", "true");
            AndroidDriver<MobileElement> dr=new AndroidDriver<MobileElement> (url,cap);
 
 

            dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            dr.findElement(By.xpath("//android.widget.TextView[@text='Get Started']")).click();
            
            
            dr.findElement(By.xpath("//android.widget.EditText[@text='000 000 0000']")).sendKeys("9224698675");         
            dr.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
            
           
            
            try {
            	
            //Email login 
            	
            //	dr.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
            	
            	
           
           // OTP login	
            	
            	MobileElement ME = dr.findElement(By.xpath("//android.widget.EditText[@index='3']"));
            	ME.click();
            	ME.sendKeys("6");
            // dr.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("6"); 
             dr.findElement(By.xpath("//android.widget.EditText[@index='4']")).sendKeys("7"); 
             dr.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("6"); 
             dr.findElement(By.xpath("//android.widget.EditText[@index='6']")).sendKeys("9");
             
             dr.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
             
             
             dr.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).click();
             
             dr.findElement(By.xpath("//android.widget.TextView[@text='Proceed & Pay']")).click();
             
             
             
           /*  dr.findElement(By.xpath("//android.widget.EditText[@index='3']")).click();
             
             
              String str = dr.findElement(By.xpath("//android.widget.EditText[@index='3']")).getText();
             
             System.out.println( "Before enter :- " +str);
             
             dr.findElement(By.xpath("//android.view.ViewGroup[@index='9']")).click();
             
             String str2 = dr.findElement(By.xpath("//android.widget.EditText[@index='3']")).getText();
             
             System.out.println( "After enter :- " +str2); */
             
            }catch(Exception e)
            {
            	System.out.println("Exception is - "+e);
            	
            }
            
            
            
            
            
            
           // dr.close();
            
            //Comment one

	}

}
