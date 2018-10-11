package appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends android_test1
{
	
	public static void main	(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=capabilities();
	}

}
