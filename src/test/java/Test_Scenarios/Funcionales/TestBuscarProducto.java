package Test_Scenarios.Funcionales;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.BusquedaPage.BusquedaProductoPage;
import Test_Scenarios.BaseTest;

public class TestBuscarProducto extends BaseTest {
	
	 public BusquedaProductoPage BPP;

	    @Parameters({"producto"})
	    @Test
	    public void testEscenario1(String producto) throws InterruptedException {
	        BPP.clickInputBusqueda();
	        Thread.sleep(5000);
	        BPP.buscarProducto(producto);
	        Thread.sleep(5000);
	        BPP.encontrarResultado();
	        
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	        BPP = new BusquedaProductoPage(driver);
	    }

}
