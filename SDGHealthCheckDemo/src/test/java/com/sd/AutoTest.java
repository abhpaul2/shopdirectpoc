package com.sd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.sql.*;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class AutoTest {
	
	//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
	//System.setProperty("webdriver.gecko.driver", "C:/software/geckodriver-v0.20.1-win64/geckodriver.exe");	
	
	
	
	    private WebDriver driver;
	    private Connection conn;
		@Test				
		public void testEasy() {
			
			try {
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery("SELECT SYSDATE FROM DUAL");
				while(rs.next()) {
	                System.out.println(rs.getObject(1)); 
	            }
				System.out.println("Automated testing sucessful. Database is up and running.");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
			
			/*driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	*/
			
			
		}	
		@BeforeTest
		public void beforeTest() {
			String url = "jdbc:oracle:thin:@192.168.99.100:1521:XE";
	        String username = "system";
	        String password = "oracle";
	        String driver = "oracle.jdbc.driver.OracleDriver";
	        try {
				Class.forName(driver);				
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException | ClassNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
			
			/*System.setProperty("webdriver.gecko.driver", "C:/software/geckodriver-v0.20.1-win64/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.setLogLevel(FirefoxDriverLogLevel.TRACE);
			options.addPreference("security.sandbox.content.level", 5);
		    driver = new FirefoxDriver(options);*/
		}		
		@AfterTest
		public void afterTest() {
			//driver.quit();	
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
}	
