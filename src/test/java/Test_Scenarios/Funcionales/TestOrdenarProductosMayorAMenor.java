package Test_Scenarios.Funcionales;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.BusquedaPage.OrdenarProductosPorPrecioPage;
import Test_Scenarios.BaseTest;

public class TestOrdenarProductosMayorAMenor extends BaseTest {
    
	public OrdenarProductosPorPrecioPage OPPP;

    @Test
    public void testEscenario1() throws InterruptedException {
    	OPPP.clickOpcioComidasPreparadas();
        Thread.sleep(10000);
        OPPP.clickSushi();
        Thread.sleep(5000);
        OPPP.clickOpcionOrdenarPorPrecio();
        Thread.sleep(10000);
        OPPP.seleccionarDeMayorAMenor();
        
    }

    @BeforeMethod
    public void methodLevelSetUp()
    {
    	OPPP = new OrdenarProductosPorPrecioPage(driver);
    }

}
