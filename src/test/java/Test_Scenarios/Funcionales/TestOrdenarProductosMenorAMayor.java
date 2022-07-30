package Test_Scenarios.Funcionales;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.BusquedaPage.OrdenarProductosPorPrecioPage;
import Test_Scenarios.BaseTest;

public class TestOrdenarProductosMenorAMayor  extends BaseTest {
	public OrdenarProductosPorPrecioPage OPPP;

    @Test
                                                                public void testEscenario1() throws InterruptedException {
    	OPPP.clickOpcionBebidas();
        Thread.sleep(5000);
        OPPP.clickOpcionOrdenarPorPrecio();
        Thread.sleep(5000);
        OPPP.seleccionarDeMenorAMayor();
        Thread.sleep(10000);
        assertTrue(OPPP.encontrarLataMelocoton(),"No se encuentra");
        
    }

    @BeforeMethod
    public void methodLevelSetUp()
    {
    	OPPP = new OrdenarProductosPorPrecioPage(driver);
    }

}
