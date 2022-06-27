package org.testing.WebTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webTest {

	
	@Test
public void WebTestCase() {
	//invoke the chromeDriver to launch the chrome
	System.setProperty("webdriver.chrome.driver", "../RishabhWebAssignment/drivers/chromedriver");
	WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.google.com/"); //navigate to googel.com
    driver.manage().window().maximize(); // maximize the chrome browser
    driver.manage().deleteAllCookies(); // 
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    WebElement wb = driver.findElement(By.xpath("//*[@title='Search']")); //xpath of google search bar
    wb.sendKeys("Selenium");// typing Selenium in search bar
    wb.sendKeys(Keys.ENTER); //press enter 
    driver.findElement(By.xpath("(//*[text()='Selenium'])[1]")).click();// xpath to open https://www.selenium.dev
    
    
    // this code is to verify the testCase
    String expectedURL = "https://www.selenium.dev/";
    String expectedTitle = "Selenium";
    Assert.assertEquals(driver.getTitle(), expectedTitle);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    driver.close();
    
    
}
}
