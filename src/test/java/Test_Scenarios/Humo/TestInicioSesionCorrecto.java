package Test_Scenarios.Humo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.InicioSesion.InicioSesion;
import Test_Scenarios.BaseTest;

public class TestInicioSesionCorrecto extends BaseTest {
	 public InicioSesion ISI;

	    @Parameters({"correoCorrectoHumo","contrasenaCorrectaHumo"})
	    @Test
	    public void testEscenario1(String correo, String contrasena) throws InterruptedException {
	    	ISI.clickBotonInicio();
	    	Thread.sleep(5000);
	    	ISI.llenarInputCorreo(correo);
	    	Thread.sleep(2000);
	    	ISI.llenarInputContrasena(contrasena);
	    	Thread.sleep(2000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(5000);
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	ISI = new InicioSesion(driver);
	    }
}
