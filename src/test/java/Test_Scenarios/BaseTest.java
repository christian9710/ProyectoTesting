package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Objects.HomePage;
import Objects.LoginPage;

public class BaseTest {

    private String loggerHeader = "BaseTest::";
    public WebDriver driver;

    public LoginPage LP;
    public HomePage HP;

    @Parameters({"Browser","Url"})
    @BeforeClass
    public void InitialSetUp(String browser, String url)
    {

    	System.setProperty("webdriver.chrome.driver", "C:/Users/Yozzco/Documents/chromedriver.exe");
    	ChromeOptions options = new ChromeOptions(); 
    	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        this.LP = new LoginPage(driver);
        this.HP = new HomePage(driver);
    }

    @AfterClass
    public void teardown() {
        try {
            driver.quit();
        }catch(Exception e){
            System.out.println("Error on " + loggerHeader + "teardown");
            System.out.println(e);
        }
    }

    public void loginProcess(String email, String contrasenna) throws InterruptedException {
        this.HP.clickUserButton();
        this.HP.clickIngresarButton();
        this.LP.loginProcess(email, contrasenna);
    }

}

