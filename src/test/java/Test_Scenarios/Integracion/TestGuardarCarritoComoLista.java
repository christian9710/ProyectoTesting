package Test_Scenarios.Integracion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Objects.BusquedaPage.BuscarProductosPage;
import Objects.CarritoComprasPages.VaciarCarritoComprasPage;
import Test_Scenarios.BaseTest;

public class TestGuardarCarritoComoLista extends BaseTest {
	
	public BuscarProductosPage BPP;
	public LoginPage LP;
	public HomePage HP;
	public VaciarCarritoComprasPage VCCP;
	
	 @Parameters({"correo","contrasena","producto","nombreLista"})
	    @Test
	    public void GuardarCarritoComoLista(String correo,String contrasena,String producto, String nombreLista) {
	        try {
	            Thread.sleep(5000);
	            this.loginProcess(correo, contrasena);
	            Thread.sleep(5000);
	            this.VCCP.sendKeys(BPP.inputBusqueda, producto);
	            this.VCCP.closeTutorial();
	            this.VCCP.vaciarCarritoCompras();
	            Thread.sleep(5000);
	            this.VCCP.click(this.VCCP.btnAgregarProducto);
	            Thread.sleep(5000);
	            this.VCCP.click(this.VCCP.btnPickUpEntrega);
	            this.VCCP.click(this.VCCP.rbSitioGuacima);
	            this.VCCP.click(this.VCCP.btnConfirmarRecogerPedido);
	            this.VCCP.click(this.VCCP.btnCarritoCompras);
	            this.VCCP.click(this.VCCP.btnGuardarComoLista);
	            this.VCCP.sendKeys(this.VCCP.txtNombreLista, nombreLista);
	            this.VCCP.click(this.VCCP.btnCrearLista);
	            this.VCCP.click(this.VCCP.btnOkCrearLista);
	            Thread.sleep(5000);
	            this.driver.get("https://www.automercado.cr/profile/lists");
	            Thread.sleep(5000);
	        } catch (Exception error) {
	            System.out.println("Error en GuardarCarritoComoLista");
	            System.out.println(error);
	        }
	    }
	 
	   @BeforeMethod
	    public void methodLevelSetUp()
	    {
	        BPP = new BuscarProductosPage(driver);
	        LP = new LoginPage(driver);
	        VCCP = new VaciarCarritoComprasPage(driver);
	        HP  = new HomePage(driver);
	    }

}
