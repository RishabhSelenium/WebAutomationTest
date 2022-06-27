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
2. You should find the chromeDriver in 
3. Navigate to ```src/test/java``` and open ```webTest.java``` file under ```org.testing.WebTest``` package.
4. Run ``webTest.java``` as TestNG



I used only one class to write this test case as the code is very less.
I created maven project to get the Selenium jar files
I used TestNG to run and generate test report
I used assertion to verify the expected Title and URL
