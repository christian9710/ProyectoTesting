package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private WebDriver driver;

    By InputEmail = By.xpath("//input[@type='email'][@ng-model='email']");
    By InputPass = By.xpath("//input[@type='password'][@ng-model='password']");
    public By LoginButton = By.xpath("//button[@ng-click='login()']");
    By DropdownInfoUser = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[1]/div/button/span/b\r\n"
    		+ "");

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
    
    public boolean isLoginSuccessful() 
    {
    	return isDisplayed(DropdownInfoUser);
    }

    public void loginProcess(String correo, String contrasena) throws InterruptedException {
        this.sendKeys(InputEmail,correo);
        this.sendKeys(InputPass,contrasena);
        this.click(LoginButton);
    }
    
}

