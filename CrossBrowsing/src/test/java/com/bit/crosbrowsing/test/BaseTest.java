package com.bit.crosbrowsing.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	WebDriver Dr;
	@Before
	public void start() {
		String x=System.getProperty("browser");
		String y=System.getProperty("runMode");
	
		if(x.equals("Firefox"))
		{
		if(y.equals("local"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iftekher\\Desktop\\BitTech Files 0012.exe");
		Dr=new FirefoxDriver();
		}
		else if(y.equals("remote"))
		{
			System.out.println("ran remotely");
		}
		else if(y.equals("local"));
		}
	
	}
}