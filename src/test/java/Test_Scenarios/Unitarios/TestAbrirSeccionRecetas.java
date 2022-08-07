package Test_Scenarios.Unitarios;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.Secciones.InicioSesisionSeccion;
import Objects.Secciones.RecetasPage;
import Test_Scenarios.BaseTest;

public class TestAbrirSeccionRecetas extends BaseTest {

	public RecetasPage RP; 
	
	@BeforeMethod
	public void SetUp() 
	{
		RP = new RecetasPage(driver);
	}
	
	@Test
	public void TestRecetas()  throws InterruptedException
	{
		RP.ClickSeccionRecetas();
        Thread.sleep(5000);
        assertTrue(RP.EncontrarAcompa(), "Not found");
	}

}
