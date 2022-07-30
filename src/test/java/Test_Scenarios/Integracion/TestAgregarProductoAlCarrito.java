package Test_Scenarios.Integracion;

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
	
	 @Parameters({"producto","correo","contrasena"})
	    @Test
	    public void FirstTest(String producto ,String correo,String contrasena) throws InterruptedException {


	        HP.inputSearch(producto);
	        Thread.sleep(5000);

	        HP.CerrarReproductorModal();
	        Thread.sleep(5000);

	        APCC.btnAgregarProductoCarne();
	        Thread.sleep(5000);

	        ALP.login(correo,contrasena);
	        Thread.sleep(5000);

	        ALP.clickLoginButton();
	        Thread.sleep(5000);

	        HP.clickMetodoEntregaButton();
	        Thread.sleep(5000);

	        HP.clickPickUpButton();
	        Thread.sleep(5000);

	        HP.ElegirSucursalButton();
	        Thread.sleep(5000);

	        HP.ConfirmSucursalButton();
	        Thread.sleep(5000);

	        APCC.btnAgregarProductoCarne();
	        Thread.sleep(5000);

	        APCC.btnAgregarMas();
	        Thread.sleep(5000);


	    }

	    @BeforeMethod
	    public void methodLevelSetUp()

	    {   APCC = new AgregarProductosCarritoPage(driver);
	        HP = new HomePage(driver);
	        ALP = new LoginPage(driver);

	    }

}
