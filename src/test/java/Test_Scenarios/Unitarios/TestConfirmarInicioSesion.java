package Test_Scenarios.Unitarios;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Objects.BusquedaPage.BusquedaProductoPage;
import Objects.CarritoComprasPages.GuardarCarritoComprasPage;
import Objects.Secciones.IniciarSessionDatosUsuario;
import Objects.Secciones.InicioSesisionSeccion;
import Test_Scenarios.BaseTest;

public class TestConfirmarInicioSesion  extends BaseTest {
	public IniciarSessionDatosUsuario ALP;
	public InicioSesisionSeccion ISS;
	 @Parameters({"correo","contrasena"})
	    @Test
	    public void ConfirmationTest(String correo,String contrasena) throws InterruptedException {

		 	ISS.ClickSeccionIniciarSesion();
	        Thread.sleep(5000);

	        ALP.login(correo,contrasena);
	        Thread.sleep(5000);

	        ALP.clickLoginButton();
	        Thread.sleep(5000);
	        
	        ALP.isLoginSuccessful();
	        Thread.sleep(5000);
	        
	 }
	 
   @BeforeMethod
    public void methodLevelSetUp()
    {
	   ALP = new IniciarSessionDatosUsuario(driver);
	   ISS = new InicioSesisionSeccion(driver);
    }

}
