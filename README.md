# WebAutomationTest

As the line of code is very less I write the code in one file only. We can also create a proper framework like I created for API automation task. 

This project will launch the chrome browser and do the followings

* Go to 'www.google.com'
* Type 'Seleniumhq' in the searchbox
* Press 'ENTER' in the searchbox
* Click on 'Selenium HQ' link
* Verify the expected Title and URL

Steps to run the TestCase    

1. Check if Chrome browser is installed. If installed it should be compatible with chromeDriver.
2. I used Mac ChromDriver which is compatible with - Version 103.0.5060.53 of Chrome Browser.
3. If you are using windows, you need to download and replace the ChromeDriver from *https://chromedriver.chromium.org/downloads*
2. You should find the chromeDriver in **drivers** folder
3. Navigate to ```src/test/java``` and open ```webTest.java``` file under ```org.testing.WebTest``` package.
4. Run ``webTest.java``` as TestNG

<h4>Please Note</h4>

* you can run this script with any web browser, you just need to download the driver for the specific brower and update 1 line of code ```WebDriver driver = new ChromeDriver();``` at ```webTest.java``` file 



I used only one class to write this test case as the code is very less.
I created maven project to get the Selenium jar files
I used TestNG to run and generate test report
I used assertion to verify the expected Title and URL
