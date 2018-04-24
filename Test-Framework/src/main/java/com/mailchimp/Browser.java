package com.mailchimp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	
	static WebDriver driver = new ChromeDriver();  // Setup webdriver to use Chrome Driver
	static List<String> leaders = new ArrayList<>();  // create a collection for leaders  found on about page
	static WebDriverWait wait = new WebDriverWait(driver, 10); // Setup Explicit Wait time for searching for About link
	
	
	public static void goTo(String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // wait for up to 10 seconds for page to load before throwing error
		driver.get(url); // get URL from param
	}

	public static String title() {
		return driver.getTitle();  // Search for the title of the current page
	}
	
	public static void clickAbout() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("About MailChimp")));  // wait for up to 10 seconds to find and click the about link before throwing error
		driver.findElement(By.linkText("About MailChimp")).click();
	}
	

	public static void close() {
		driver.close(); 
		
	}

	public static List<String> searchLeaders() throws IOException {
		
		File leaderFile = new File("./leaders.csv");  // create empty leaders csv file
		FileWriter fr = new FileWriter(leaderFile, true);  // configure the way the csv file will be written
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //// wait for up to 10 seconds to find all leaders before throwing error
		
		List<WebElement> leaderList = driver.findElements(By.cssSelector("[data-description]"));  //  find all the elements that have data-description attribute
		
		fr.write("TITLE");  // write to csv file (set 1st column header)
		fr.append(',');
		fr.append("POSITION"); // write to csv file (set 2nd column header)
		fr.append(',');
		fr.append("DESCRIPTION"); // write to csv file (set 3rd column header)
		fr.append('\n');
		
		for (WebElement leader : leaderList) {  // for each leader found by specified attribute above, extract and write the required attribute values to the csv file
			fr.append(leader.getAttribute("data-title"));
			fr.append(',');
			fr.append(leader.getAttribute("data-position"));
			fr.append(',');
			fr.append('"' + leader.getAttribute("data-description") + '"');
			fr.append('\n');
	        
	    }
        fr.close();  // close the csv file

		return leaders;
	} 

}
