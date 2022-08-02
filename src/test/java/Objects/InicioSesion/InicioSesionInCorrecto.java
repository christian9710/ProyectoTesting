package Objects.InicioSesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class InicioSesionInCorrecto extends BasePage {
    public By btnInicio = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-button/button");
    public By inputCorreo = By.xpath("//*[@id=\"email\"]");
    public By btnIniciarSesion = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[4]/am-button");
    public By inputPassword = By.xpath("//*[@id=\"password\"]");
    public By confirmacion = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[4]/div/div/span\r\n");
	public InicioSesionInCorrecto (WebDriver driver){
        super(driver);
    }
	
	public void clickBotonInicio() {
		click(btnInicio);
	}
	
	public void clickBotonIniciarSesion() {
		click(btnIniciarSesion);
	}
	
    public void llenarInputCorreo(String correo)
    {
        sendKeys(inputCorreo,correo);
    }
    
    public void llenarInputContrasena(String contrasena)
    {
        sendKeys(inputPassword,contrasena);
    }
    
    public boolean encontrarConfirmacion() {
    	return isDisplayed(confirmacion);
    }
}
