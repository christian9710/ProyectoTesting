package Test_Scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.FiltroProductosPorMarcaPage;


public class TestFiltrarProductosPorMarca_Escenario1 extends BaseTest {

    public FiltroProductosPorMarcaPage FPPM;

    @Test
    public void testEscenario1() throws InterruptedException {
        FPPM.clickCategorias();
        Thread.sleep(5000);
        FPPM.clickOpcionAbarrotes();
        Thread.sleep(5000);
        FPPM.clickOpcionCereales();
        Thread.sleep(5000);
        FPPM.seleccionarMarcaCerales();
        Thread.sleep(5000);
    }

    @BeforeMethod
    public void methodLevelSetUp()
    {
        FPPM = new FiltroProductosPorMarcaPage(driver);
    }


}
