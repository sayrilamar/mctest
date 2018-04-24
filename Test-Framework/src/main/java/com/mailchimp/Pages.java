package com.mailchimp;

import com.mailchimp.AboutPage;
import com.mailchimp.HomePage;

public class Pages {
	
	public static HomePage homepage() { // Calls HomePage class
		return new HomePage();
	}

	public static AboutPage aboutpage() {  // Calls AboutPage class
		return new AboutPage();
	}

}
