package Test_Scenarios.Integracion;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Objects.CarritoComprasPages.AgregarProductosCarritoPage;
import Test_Scenarios.BaseTest;

public class TestAgregarProductoAlCarrito extends BaseTest {
	public AgregarProductosCarritoPage APCC;
	public LoginPage ALP;
	public HomePage HP;
	
	 @Parameters({"correo","contrasena"})
	    @Test
	    public void FirstTest(String correo,String contrasena) throws InterruptedException {

	     
		 	ALP.clickIniciarSesion();
	        Thread.sleep(5000);

		 	ALP.login(correo,contrasena);
	        Thread.sleep(5000);

	        ALP.clickLoginButton();
	        Thread.sleep(5000);
	        
	        HP.CerrarReproductorModal();
	        Thread.sleep(10000);

	        APCC.clickBtnBebidasLicores();
	        Thread.sleep(10000);

	        APCC.clickBtnAgregarProducto();
	        Thread.sleep(10000);

	        APCC.clickBtnTipoEntregaPickUp();
	        Thread.sleep(5000);

	        APCC.clickBtnRegular();
	        Thread.sleep(5000);

	        APCC.clickBtnGuardar();
	        Thread.sleep(10000);
	        
	        APCC.clickBtnAgregarProducto();
	        Thread.sleep(10000);
	        
	        APCC.clickBtnCarrito();
	        Thread.sleep(5000);
	        
	        assertTrue(APCC.buscarProducto(),"No se encuentra");
	        Thread.sleep(5000);


	    }

	    @BeforeMethod
	    public void methodLevelSetUp()

	    {   APCC = new AgregarProductosCarritoPage(driver);
	        HP = new HomePage(driver);
	        ALP = new LoginPage(driver);

	    }

}
