import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidTest1 extends Base
{
	
	public static void main	(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=capabilities();
	}

}
