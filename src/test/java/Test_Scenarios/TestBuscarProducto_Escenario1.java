package Test_Scenarios;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.BusquedaProductoPage;

public class TestBuscarProducto_Escenario1 extends BaseTest {
	
	 public BusquedaProductoPage BPP;

	    @Parameters({"producto"})
	    @Test
	    public void testEscenario1(String producto) throws InterruptedException {
	        BPP.clickInputBusqueda();
	        Thread.sleep(5000);
	        BPP.ingresarProducto(producto);
	        Thread.sleep(5000);
	    }

	    @BeforeMethod
	    public void methodLevelSetUp()
	    {
	        BPP = new BusquedaProductoPage(driver);
	    }

}
