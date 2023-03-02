package com.Restaurant.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Restaurant.Action.ActionClass;
import com.Restaurant.PageObjects.LoginPage;
import com.Restaurant.Utilities.ExtentReport;

public class BaseClass {
	
		public static Properties prop;
		//public static WebDriver driver;
		public static ActionClass action;
		public static LoginPage Lp;
		//public static 
		//loadConfig method is to load the configuration
		
		//Thread local driver
		 public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>(); 
		 
		@BeforeSuite
		public void loadConfig() {
			  DOMConfigurator.configure("log4j.xml");
			 ExtentReport.setExtent();
			try {
				 prop = new Properties();
				FileInputStream ip = new FileInputStream(
						System.getProperty("user.dir") + "\\Configurations\\config.properties");
				prop.load(ip);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		//I am using my testng xml file to get the browser name
		@Parameters("Browser")
		@BeforeMethod
		public void firstcall(String browser) {
			launchApp(browser);
			 Lp = new LoginPage();
		}
		
		public static WebDriver getDriver()
		{
			return driver.get();
		}
		   public static void launchApp(String browserName){
		 //String browserName = prop.getProperty("Broswer");
			if (browserName.equalsIgnoreCase("Chrome")) {
				 driver.set(new ChromeDriver());
			} else if (browserName.equalsIgnoreCase("FireFox")) {
			     driver.set(new FirefoxDriver());
			} else if (browserName.equalsIgnoreCase("Edge")) {
			     // driver = new EdgeDriver();
			      driver.set(new EdgeDriver());
			}
			//Maximize the screen
			getDriver().manage().window().maximize();
			action = new ActionClass();
			//Implicit TimeOuts
		   action.implicitWait(getDriver(), 10);
			//PageLoad TimeOuts
			action.pageLoadTimeOut(getDriver(), 30);   
			getDriver().get(prop.getProperty("url"));
			 
		}
		   @AfterMethod
		   public void Close()
		   {
			   getDriver().close();
		   }
		@AfterSuite
		public void Closing()
		{		  
		   ExtentReport.endReport();
		}

		
		}


