package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private WebDriver driver;

    By InputEmail = By.xpath("//input[@type='email'][@ng-model='email']");
    By InputPass = By.xpath("//input[@type='password'][@ng-model='password']");
    public By LoginButton = By.xpath("//button[@ng-click='login()']");

    public LoginPage(WebDriver driver){

        super(driver);
    }


    public void login(String correo, String contrasena)
    {
        sendKeys(InputEmail,correo);
        sendKeys(InputPass,contrasena);
    }

    public void clickLoginButton()
    {
        click(LoginButton);
    }

    public void loginProcess(String correo, String contrasena) throws InterruptedException {
        this.sendKeys(InputEmail,correo);
        this.sendKeys(InputPass,contrasena);
        this.click(LoginButton);
    }

}

