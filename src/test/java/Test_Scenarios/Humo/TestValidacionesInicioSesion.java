package Test_Scenarios.Humo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.InicioSesion.InicioSesion;
import Test_Scenarios.BaseTest;

public class TestValidacionesInicioSesion extends BaseTest {
	 public InicioSesion ISI;

	    @Test
	    public void testEscenario1() throws InterruptedException {
	    	ISI.clickBotonInicio();
	    	Thread.sleep(3000);
	    	ISI.clickInputCorreo();
	    	Thread.sleep(1000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(1000);
	    	assertTrue(ISI.encontrarConfirmacionCorreo(),"No se encuentra la confirmación indicada");
	    	Thread.sleep(1000);
	    	ISI.clickInputContrasenna();
	    	Thread.sleep(1000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(1000);
	    	assertTrue(ISI.encontrarConfirmacionCotnrasena(),"No se encuentra la confirmación indicada");
	    	Thread.sleep(1000);
	    	ISI.clickBotonIniciarSesion();
	    	Thread.sleep(1000);
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	    	ISI = new InicioSesion(driver);
	    }
}
