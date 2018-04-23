package com.mailchimp;

import java.io.IOException;

import com.mailchimp.Browser;

public class AboutPage {
	
	static String url = "https://mailchimp.com/";  // Set MC HomePage URL
	static String title = "About MailChimp Culture and Community";  // Set expected page title for AboutPage
	


	public void goTo() {
		Browser.clickAbout();  // Click About link at the bottom of the homepage
	}
	
	public boolean isAt() {
		return Browser.title().equals(title); // Check to see if the actual title of the current page matches the "title" variable above
	}

	public boolean findLeaders() throws IOException {
		return Browser.searchLeaders() != null; // returns TRUE if leaders are found on the current page
	}

}
