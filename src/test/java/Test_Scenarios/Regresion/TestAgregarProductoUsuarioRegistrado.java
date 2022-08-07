package Test_Scenarios.Regresion;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.FiltrosProductos.SeleccionProductos;
import Test_Scenarios.BaseTest;

public class TestAgregarProductoUsuarioRegistrado extends BaseTest {
	 public SeleccionProductos SP;

	    @Parameters({"correoCorrectoHumo","contrasenaCorrectaHumo"})
	    @Test
	    public void testEscenario1(String correo, String contrasena) throws InterruptedException {
	    	Thread.sleep(10000);
	    	SP.clickBtnCategoria();
	    	Thread.sleep(10000);
	    	SP.clickBtnProducto();
	    	Thread.sleep(5000);
	    	SP.llenarInputCorreo(correo);
	    	Thread.sleep(2000);
	    	SP.llenarInputContrasena(contrasena);
	    	Thread.sleep(2000);
	    	SP.clickBtnInicioSesion();
	    	Thread.sleep(10000);
	    	SP.clickBody();
	    	Thread.sleep(5000);
	    	SP.clickBtnProducto();
	    	Thread.sleep(5000);
	    	assertTrue(SP.encontrarModal(),"No se encuentra el elemento indicado");
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	SP = new SeleccionProductos(driver);
	    }
}
