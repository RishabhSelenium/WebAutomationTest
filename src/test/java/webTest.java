import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTest {

public static void main(String[] args) throws InterruptedException {
	//invoke the chromeDriver to launch the chrome
	System.setProperty("webdriver.chrome.driver", "../RishabhWebAssignment/drivers/chromedriver");
	WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.google.com/"); //navigate to googel.com
    driver.manage().window().maximize(); // maximize the chrome browser
    driver.manage().deleteAllCookies(); // 
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    driver.switchTo().frame(driver.findElement(By.name("callout"))); 
//    driver.findElement(By.xpath("//button[contains(@aria-label, 'No thanks')]")).click();
//    driver.switchTo().parentFrame();
    WebElement wb = driver.findElement(By.xpath("//*[@title='Search']")); //xpath of
    wb.sendKeys("Selenium");// typing Selenium in search bar
    wb.sendKeys(Keys.ENTER); //press enter 
    driver.findElement(By.xpath("(//*[text()='Selenium'])[1]")).click();// xpath of sea
    
    String expectedURL = "https://www.selenium.dev/";
    String expectedTitle = "Selenium";
    Assert.assertEquals(driver.getTitle(), expectedTitle);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    driver.close();
    
    
}
}
