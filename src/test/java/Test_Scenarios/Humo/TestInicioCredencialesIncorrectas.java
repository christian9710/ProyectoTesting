package Test_Scenarios.Humo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.InicioSesion.InicioSesion;
import Test_Scenarios.BaseTest;

public class TestInicioCredencialesIncorrectas extends BaseTest{
	 public InicioSesion ISI;

	    @Parameters({"correoLoginHumo","contrasenaLoginHumo"})
	    @Test
	    public void testEscenario1(String correo, String contrasena) throws InterruptedException {
	    	ISI.clickBotonInicio();
	    	Thread.sleep(5000);
	    	ISI.llenarInputCorreo(correo);
	    	Thread.sleep(2000);
	    	ISI.llenarInputContrasena(contrasena);
	    	Thread.sleep(2000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(3000);
	    	assertTrue(ISI.encontrarConfirmacion(),"No se encuentra la confirmación indicada");
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	ISI = new InicioSesion(driver);
	    }
	    

}
