package Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;

    public BasePage(WebDriver driver)
    {

        this.driver = driver;
    }

    public void click(By element)
    {

        driver.findElement(element).click();
    }
    
    public void fillDropdownOption(By element, int index) {
    	Select select = new Select(driver.findElement(element));
    	select.deselectByIndex(index);
    }
    
    public void sendKeys(By element, String text)
    {

        driver.findElement(element).sendKeys(text);
    }
    
    public boolean isDisplayed(By element)
    {
    	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    	return driver.findElement(element).isDisplayed();
    }


}