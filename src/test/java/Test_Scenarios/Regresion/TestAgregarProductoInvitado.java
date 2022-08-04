package Test_Scenarios.Regresion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.FiltrosProductos.SeleccionProductos;
import Objects.InicioSesion.InicioSesion;
import Test_Scenarios.BaseTest;

public class TestAgregarProductoInvitado extends BaseTest {
	 public SeleccionProductos SP;

	    @Parameters({"correoCorrectoHumo","contrasenaCorrectaHumo"})
	    @Test
	    public void testEscenario1(String correo, String contrasena) throws InterruptedException {
	    	SP.clickBtnCategoria();
	    	Thread.sleep(5000);
	    	SP.clickBtnProducto();
	    	Thread.sleep(5000);
	    	SP.llenarInputCorreo(correo);
	    	Thread.sleep(2000);
	    	SP.llenarInputContrasena(contrasena);
	    	Thread.sleep(2000);
	    	SP.clickBtnInicioSesion();
	    	Thread.sleep(2000);
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	SP = new SeleccionProductos(driver);
	    }
}
