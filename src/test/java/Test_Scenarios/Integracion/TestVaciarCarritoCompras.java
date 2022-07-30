package Test_Scenarios.Integracion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Objects.CarritoComprasPages.GuardarCarritoComprasPage;
import Test_Scenarios.BaseTest;

public class TestVaciarCarritoCompras extends BaseTest {
	
	public GuardarCarritoComprasPage VCCP;
	
	 @Parameters({"correo","contrasena"})
	    @Test
	    public void VaciarCarritoDeCompras(String correo,String contrasena) {
	        try {
	            Thread.sleep(7000);
	            this.loginProcess(correo, contrasena);
	            Thread.sleep(7000);
	            this.VCCP.vaciarCarritoCompras();
	            Thread.sleep(7000);
	        } catch (Exception error) {
	            System.out.println("Error en VaciarCarritoDeCompras");
	            System.out.println(error);
	        }
	    }
	
	  @BeforeMethod
	    public void methodLevelSetUp()
	    {
		  VCCP = new GuardarCarritoComprasPage(driver);
	    }
}
