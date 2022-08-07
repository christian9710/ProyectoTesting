package Test_Scenarios.Unitarios;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.Secciones.InicioSesisionSeccion;
import Test_Scenarios.BaseTest;

public class TestAbrirSeccionInicioSesion extends BaseTest{
	public InicioSesisionSeccion ISS; 
	
	@BeforeMethod
	public void SetUp() 
	{
		ISS = new InicioSesisionSeccion(driver);
	}
	
	@Test
	public void TestRecetas()  throws InterruptedException
	{
		ISS.ClickSeccionIniciarSesion();
        Thread.sleep(5000);
        assertTrue(ISS.SeMuestraElModal(), "Error");
	}

}
