package Test_Scenarios;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.AgregarProductosPage;
import Objects.HomePage;
import Objects.LoginPage;


public class TestAgregarProductosCarrito_Escenario1 extends BaseTest {
	    public AgregarProductosPage CPP;
	    public LoginPage AlP;
	    public HomePage HP;


	    @Parameters({"producto","correo","contrasena"})
	    @Test
	    public void FirstTest(String producto ,String correo,String contrasena)throws InterruptedException {


	        HP.inputSearch(producto);
	        Thread.sleep(5000);

	        HP.CerrarReproductorModal();
	        Thread.sleep(5000);

	        CPP.btnAgregarProductoCarne();
	        Thread.sleep(5000);

	        AlP.login(correo,contrasena);
	        Thread.sleep(5000);

	        AlP.clickLoginButton();
	        Thread.sleep(5000);

	        HP.clickMetodoEntregaButton();
	        Thread.sleep(5000);

	        HP.clickPickUpButton();
	        Thread.sleep(5000);

	        HP.ElegirSucursalButton();
	        Thread.sleep(5000);

	        HP.ConfirmSucursalButton();
	        Thread.sleep(5000);

	        CPP.btnAgregarProductoCarne();
	        Thread.sleep(5000);

	        CPP.btnAgregarMas();
	        Thread.sleep(5000);

	    }

	    @BeforeMethod
	    public void methodLevelSetUp()

	    {   CPP = new AgregarProductosPage(driver);
	        HP = new HomePage(driver);
	        AlP = new LoginPage(driver);

	    }


}
