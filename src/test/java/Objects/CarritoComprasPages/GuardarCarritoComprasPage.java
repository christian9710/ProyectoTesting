package Objects.CarritoComprasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class GuardarCarritoComprasPage extends BasePage{
    	 public By btnCarritoCompras = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/div/img\n");
    	 By btnVaciarCarritoCompras = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/form/div/div[2]/div[2]/button[2]");
    	 By btnCerrarCarritoCompras = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/form/div/div[1]/div[2]/button/span");
		 By btnCrearLista = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/form/div/div[2]/div[2]/button[1]");
		 By btnNuevaLista = By.xpath("/html/body/ngb-modal-window/div/div/am-save-list/div[2]/div[1]/div[1]/div/div\n");
		 By inputNombreLista = By.xpath("/html/body/ngb-modal-window/div/div/am-new-list/div[2]/div[2]/input");
		 By btnPaseos = By.xpath("/html/body/ngb-modal-window/div/div/am-new-list/div[2]/div[3]/div/div[2]/img");
		 By btnGuardarLista = By.xpath("/html/body/ngb-modal-window/div/div/am-new-list/div[2]/am-button/button\n");
		 By modalSuccess = By.xpath("/html/body/ngb-modal-window/div/div/am-success-modal/div[2]/div");
		 By btnCarrito = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/div/img");
		 
		public GuardarCarritoComprasPage(WebDriver driver) {
	        super(driver);
	    }
	    
		public void clickBtnCarrito() {
			  click(btnCarrito);
		}
		
	    public void clickGuardarCarritoComoLista() {
	    	click(btnCrearLista);
	    }
	    
	    public void clickNuevaLista() {
	    	click(btnNuevaLista);
	    }
	    
	    public void ingresaNombreLista(String nombreLista) {
	    	 sendKeys(inputNombreLista,nombreLista);
	    }
	    
	    public void clickPaseos() {
	    	click(btnPaseos);
	    }
	    
	    public void clickGuardarLista() {
	    	click(btnGuardarLista);
	    }
	    
	    public boolean modalEsMostrado() {
	    	return isDisplayed(modalSuccess);
	    }
	    
	    public void vaciarCarritoCompras() throws InterruptedException {
	        this.click(this.btnCarritoCompras);
	        Thread.sleep(3000);
	        try {
	            Boolean isPresent = this.driver.findElements(this.btnVaciarCarritoCompras).size() > 0;
	            if(isPresent) {
	                this.click(this.btnVaciarCarritoCompras);
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
