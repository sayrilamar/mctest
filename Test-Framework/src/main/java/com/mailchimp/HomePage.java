package com.mailchimp;

import com.mailchimp.Browser;

public class HomePage {
	
	static String url = "https://mailchimp.com/";
	static String title = "Marketing Automation - Sell More Stuff | MailChimp";

	public void goTo() {
		Browser.goTo(url);
	}
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
