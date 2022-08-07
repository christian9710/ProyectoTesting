package Objects.Secciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class InicioSesisionSeccion extends BasePage {
	By btnInicioDeSesion = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-button/button\r\n"
			+ "");
	By labelAcompa = By.xpath("/html/body/ngb-modal-window");
	public InicioSesisionSeccion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
 
	public void ClickSeccionIniciarSesion()
	{
	 click(btnInicioDeSesion);	
		
	}
	
	public boolean SeMuestraElModal()
	{
	    return isDisplayed(labelAcompa);
	}

}
