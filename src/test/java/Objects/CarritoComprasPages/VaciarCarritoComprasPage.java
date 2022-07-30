package Objects.CarritoComprasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class VaciarCarritoComprasPage extends BasePage{
	  public By btnAgregarProducto = By.xpath("(//button/span[text()[contains(.,'Agregar')]])[1]");
	    public By btnCloseTutorial = By.xpath("//img[@ng-click='onCloseAudioTutorialModal()']");
	    public By btnPickUpEntrega = By.xpath("//button[@ng-click=\"selectDeliveryType('pickUp')\"]");
//	    public By rbSitioGuacima = By.xpath("//md-radio-button[@id='radio_42']");
	    public By rbSitioGuacima = By.xpath("//md-radio-button[@aria-label=\"AM Guácima\"]");
	    public By btnConfirmarRecogerPedido = By.xpath("//button[@ng-click='saveDeliveryMethod(deliverySelected)']");
	    public By btnCarritoCompras = By.xpath("//div[@ng-controller='automercadoCartController']/div[@ng-click='openSummary();']");
	    public By btnVaciarCarritoCompras = By.xpath("//button[@ng-click=\"emptyCart();\"]");
	    public By btnVaciarCarritoComprasConfirmar = By.xpath("//button[text()=\"Si\"]");
	    public By btnVaciarCarritoComprasConfirmarCloseModal = By.xpath("//button[text()=\"OK\"]");
	    public By btnCerrarCarritoCompras = By.xpath("//div[@ng-click=\"openSummary();\"][@class=\"close-summary\"]");
	    public By btnGuardarComoLista = By.xpath("//button[@ng-click='createList(false, true, false);']");
	    public By txtNombreLista = By.xpath("//input[@class='swal2-input']");
	    public By btnCrearLista = By.xpath("//button[text()='Crear']");
	    public By btnOkCrearLista = By.xpath("//button[text()='OK']");

	    public VaciarCarritoComprasPage(WebDriver driver) {
	        super(driver);
	    }

	    public void closeTutorial() {
	        if(this.driver.findElements(btnCloseTutorial).size() !=0) {
	            this.click(btnCloseTutorial);
	        }
	    }

	    public void vaciarCarritoCompras() throws InterruptedException {
	        this.click(this.btnCarritoCompras);
	        Thread.sleep(3000);
	        try {
	            Boolean isPresent = this.driver.findElements(this.btnVaciarCarritoCompras).size() > 0;
	            if(isPresent) {
	                this.click(this.btnVaciarCarritoCompras);
	                this.click(this.btnVaciarCarritoComprasConfirmar);
	                Thread.sleep(6000);
//	                this.click(this.btnVaciarCarritoComprasConfirmarCloseModal);
	            }
	            this.click(this.btnCerrarCarritoCompras);
	        } catch(Exception error) {
	            System.out.println("Error vaciarCarritoCompras");
	            System.out.println(error);
	        }

	    }
}
