package Test_Scenarios.Funcionales;

import org.testng.annotations.Test;

import Objects.BusquedaPage.FiltroProductosPorMarcaPage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;

import Test_Scenarios.BaseTest;


public class TestFiltrarProductosPorMarca extends BaseTest {

    public FiltroProductosPorMarcaPage FPPM;

    @Test
    public void testEscenario1() throws InterruptedException {
        FPPM.clickOpcionAbarrotes();
        Thread.sleep(5000);
        FPPM.clickOpcionVerMarcas();
        Thread.sleep(5000);
        FPPM.seleccionarMarcaDelMonte();
        Thread.sleep(10000);
        assertTrue(FPPM.encontrarLataMelocoton(),"No se encuentra");
        
    }

    @BeforeMethod
    public void methodLevelSetUp()
    {
        FPPM = new FiltroProductosPorMarcaPage(driver);
    }


}