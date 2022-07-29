import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/monicazuniga/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
	}
}