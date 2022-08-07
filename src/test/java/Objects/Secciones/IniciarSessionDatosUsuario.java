package Objects.Secciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class IniciarSessionDatosUsuario  extends BasePage{
    private WebDriver driver;

    By InputEmail = By.xpath("//*[@id=\"email\"]\r\n"
    		+ "");
    By InputPass = By.xpath("//*[@id=\"password\"]\r\n");
    public By LoginButton = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[4]/am-button/button\r\n"
    		+ "");
    By DropdownInfoUser = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[1]/div/button/span/b\r\n"
    		+ "");

    public IniciarSessionDatosUsuario(WebDriver driver){

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
