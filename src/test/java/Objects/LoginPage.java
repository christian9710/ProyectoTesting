package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private WebDriver driver;

    public By iniciarSesion = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-button/button");
    By InputEmail = By.xpath("//*[@id=\"email\"]");
    By InputPass = By.xpath("//*[@id=\"password\"]");
    public By LoginButton = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[4]/am-button/button");

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
    }

    public void clickIniciarSesion()
    {
        click(iniciarSesion);
    }
}

