package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class android_test1 {

	   	  public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	      // TODO Auto-generated method stub
		  File f = new File("src");      
		  File fs = new File(f,"sunrise-calendar4-2-0.apk"); 
		  
		  DesiredCapabilities cap = new DesiredCapabilities(); 
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5"); 
		  cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath()); 
		  AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		  return driver;
		  

	}

}
