package Test_Scenarios;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;


import Objects.FiltroProductosPorMarcaPage;


public class TestFiltrarProductosPorMarca_Escenario1 extends BaseTest {

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