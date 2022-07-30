package Test_Scenarios.Integracion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.CarritoComprasPages.AgregarProductosDesdeListaComprasPage;
import Objects.CarritoComprasPages.ListaProductosPage;
import Objects.CarritoComprasPages.VaciarCarritoComprasPage;
import Test_Scenarios.BaseTest;

public class TestAgregarProductosDesdeLista extends BaseTest {
	public AgregarProductosDesdeListaComprasPage APLCP;
	public ListaProductosPage LPP;
	public VaciarCarritoComprasPage VCCP;

    @Parameters({"correo","contrasena"})
    @Test
    public void AgregarProductosACarritoDesdeLista(String correo,String contrasena) {
        try {
            Thread.sleep(8000);
            this.loginProcess(correo, contrasena);
            Thread.sleep(8000);
            this.driver.get("https://www.automercado.cr/profile/lists");
            Thread.sleep(8000);
            this.LPP.click(this.LPP.btnVerListaProductos);
            Thread.sleep(8000);
            this.APLCP.click(this.APLCP.btnAgregarProductosLista);
            Thread.sleep(8000);
            this.VCCP.click(this.VCCP.btnPickUpEntrega);
            this.VCCP.click(this.VCCP.rbSitioGuacima);
            this.VCCP.click(this.VCCP.btnConfirmarRecogerPedido);
            this.VCCP.click(this.VCCP.btnCarritoCompras);
            Thread.sleep(8000);
        } catch (Exception error) {
            System.out.println("Error en AgregarProductosACarritoDesdeLista");
            System.out.println(error);
        }
    }
    
    @BeforeMethod
    public void methodLevelSetUp()
    {
    	APLCP = new AgregarProductosDesdeListaComprasPage(driver);
    	LPP = new ListaProductosPage(driver);
    	VCCP = new VaciarCarritoComprasPage(driver);
    }

}
