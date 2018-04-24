# Selenium Test

This project tests the following scenario on MAC OS using Chrome browser:

1. Start scenario on https://mailchimp.com/
2. Navigate to MailChimps about page
3. Save each leadership team members name, position, and description
into a .csv file.
4. End scenario

### Getting Started

1. Clone the master branch from https://github.com/sayrilamar/mctest.git into your working directory
2. Open the mctest folder as a project using a java IDE (Eclipse or STS)

### Unit Tests

* MainTest.java - used to create pure and readable JUnit tests that call the Test Framework code; is not dependent on Selenium.

### Test Framework

* Pages.java - a class the contains the methods for each page
* HomePage.java - a class that contains the properties and methods for all interactions while on the Home Page
* AboutPage.java - a class that contains the properties and methods for all interactions while on the About Page
* Browser.java - a class that has the meat and potatoes for communicating with the browser via Selenium Web Driver

## Running the tests

Right click on the MainTest class in the TESTS directory, and run it as a JUnit Test:
![alt text](https://github.com/sayrilamar/mctest/blob/master/images/Screenshot%202018-04-23%2023.36.29.png?raw=true "Example: Run Test")

Results should show three passing test cases:
![alt text](https://github.com/sayrilamar/mctest/blob/master/images/Screenshot%202018-04-23%2023.32.54.png?raw=true "Example: Run Test")

## Built With

* [Java/JUnit] - Dev Framework I used
* [Maven] - Dependency Management
* [Selenium] - Used to test the scenario
