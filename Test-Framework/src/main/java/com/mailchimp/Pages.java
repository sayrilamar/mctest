package com.mailchimp;

import com.mailchimp.AboutPage;
import com.mailchimp.HomePage;

public class Pages {
	
	public static HomePage homepage() {
		return new HomePage();
	}

	public static AboutPage aboutpage() {
		return new AboutPage();
	}

}
