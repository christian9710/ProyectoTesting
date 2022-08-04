package Test_Scenarios.Humo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.InicioSesion.InicioSesion;
import Test_Scenarios.BaseTest;


public class TestInicioSesionIncorrecto extends BaseTest {
	 public InicioSesion ISI;

	    @Parameters({"correoLoginHumo"})
	    @Test
	    public void testEscenario1(String correo) throws InterruptedException {
	    	ISI.clickBotonInicio();
	    	Thread.sleep(5000);
	    	ISI.llenarInputCorreo(correo);
	    	Thread.sleep(5000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(5000);
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	ISI = new InicioSesion(driver);
	    }
}
