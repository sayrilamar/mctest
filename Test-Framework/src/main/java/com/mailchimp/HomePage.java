package com.mailchimp;

import com.mailchimp.Browser;

public class HomePage {
	
	static String url = "https://mailchimp.com/";  // MC Landing Page
	static String title = "Marketing Automation - Sell More Stuff | MailChimp"; // Text to search in Title tag on Homepage

	public void goTo() {  // Navigate to home page
		Browser.goTo(url);
	}
	
	public boolean isAt() { // Returns true of current page is home page after validating page Title above
		return Browser.title().equals(title);
	}

}
