package com.mailchimp;


import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mailchimp.Browser;
import com.mailchimp.Pages;

public class MainTest {

	@Before
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "../tools/macdrivers/chromedriver"); // configure your system to assume chrome webdriver
	}

	@Test // Try to navigate to MailChimp homepage
	public void CanGotoHomePage() {
		Pages.homepage().goTo();
		Assert.assertTrue(Pages.homepage().isAt());
	}
	
	@Test // Try to navigate to About Page from Home Page
	public void CanGotoAboutPage() {
		Pages.homepage().goTo();
		Pages.aboutpage().goTo();
		Assert.assertTrue(Pages.aboutpage().isAt());
	}
	
	@Test // Try to search for all the leaders listed on the About Page
	public void CanGetLeaders() throws IOException {
		Pages.homepage().goTo();
		Pages.aboutpage().goTo();
		Assert.assertTrue(Pages.aboutpage().findLeaders());
	}
	
	@AfterClass
	public static void close() {
		Browser.close(); // Close the browser when all tests are complete
	}

}
