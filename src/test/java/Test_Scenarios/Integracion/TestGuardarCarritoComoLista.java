package Test_Scenarios.Integracion;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Objects.BusquedaPage.BusquedaProductoPage;
import Objects.CarritoComprasPages.GuardarCarritoComprasPage;
import Test_Scenarios.BaseTest;

public class TestGuardarCarritoComoLista extends BaseTest {
	
	public BusquedaProductoPage BPP;
	public LoginPage ALP; 
	public HomePage HP;
	public GuardarCarritoComprasPage VCCP;
	
	 @Parameters({"correo","contrasena","nombreLista"})
	    @Test
	    public void GuardarCarritoComoLista(String correo,String contrasena, String nombreLista) throws InterruptedException {
			ALP.clickIniciarSesion();
	        Thread.sleep(5000);

		 	ALP.login(correo,contrasena);
	        Thread.sleep(5000);

	        ALP.clickLoginButton();
	        Thread.sleep(5000);
	        
	        HP.CerrarReproductorModal();
	        Thread.sleep(10000);
	        
	        VCCP.clickBtnCarrito();
	        Thread.sleep(5000);
	        
	        VCCP.clickGuardarCarritoComoLista();
	        Thread.sleep(5000);
	        
	        VCCP.clickNuevaLista();
	        Thread.sleep(5000);
	        
	        VCCP.ingresaNombreLista(nombreLista);
	        Thread.sleep(5000);
	        
	        VCCP.clickPaseos();
	        Thread.sleep(5000);
	        
	        VCCP.clickGuardarLista();
	        Thread.sleep(5000);
	        
	        assertTrue(VCCP.modalEsMostrado(),"No se encuentra");
	        Thread.sleep(2000);
	    }
	 
	   @BeforeMethod
	    public void methodLevelSetUp()
	    {
	        BPP = new BusquedaProductoPage(driver);
	        ALP = new LoginPage(driver);
	        VCCP = new GuardarCarritoComprasPage(driver);
	        HP  = new HomePage(driver);
	    }

}
