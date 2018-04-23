package com.mailchimp;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mailchimp.Browser;
import com.mailchimp.Pages;

public class MainTest {

	@Before
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "./tools/macdrivers/chromedriver");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
	}

	@Test
	public void CanGotoHomePage() {
		Pages.homepage().goTo();
		Assert.assertTrue(Pages.homepage().isAt());
	}
	
	@Test
	public void CanGotoAboutPage() {
		Pages.homepage().goTo();
		Pages.aboutpage().goTo();
		Assert.assertTrue(Pages.aboutpage().isAt());
	}
	
	@Test
	public void CanGetLeaders() throws IOException {
		Pages.homepage().goTo();
		Pages.aboutpage().goTo();
		Assert.assertTrue(Pages.aboutpage().findLeaders());
	}
	
	@AfterClass
	public static void close() {
		Browser.close();
	}

}
