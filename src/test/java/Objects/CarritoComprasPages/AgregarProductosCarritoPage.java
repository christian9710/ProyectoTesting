package Objects.CarritoComprasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class AgregarProductosCarritoPage extends BasePage{
	
	By bebidasLicoresButton = By.xpath("/html/body/am-main/div[2]/am-home/am-explore-products/div/section/div/div/div[2]/div/div/drag-scroll/div/div[3]/am-product-category/div/div[1]/img");
	By btnAgregar = By.xpath("//*[@id=\"add-to-cart-181014\"]");
	By btnPickUp = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-method/div/div[2]/div[2]/div/div[3]/am-method-card/div/div[2]/div[2]/am-button/button");
	By btnRegular = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-pickup/div/div[2]/div[1]/div[1]/label/span");
	By btnGuardar = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-pickup/div/div[2]/div[3]/am-button/button");
	By btnCarrito = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/div/img");
	By productoItem = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[2]/am-shopping-cart/form/div/div[3]/div/div/div[2]/div[2]/h2[1]");
   
    public AgregarProductosCarritoPage(WebDriver driver){

      super(driver);

    }

    
    public void clickBtnBebidasLicores() {
        click(bebidasLicoresButton);

    }

	public void clickBtnAgregarProducto() {
	    click(btnAgregar);
	
	}
	public void clickBtnTipoEntregaPickUp() {
	    click(btnPickUp);
	
	}
	
	public void clickBtnRegular() {
	    click(btnRegular);
	
	}
	

	public void clickBtnGuardar() {
	  click(btnGuardar);
	
	}
	
	public void clickBtnCarrito() {
		  click(btnCarrito);
		
	}
	public boolean buscarProducto() {
		return isDisplayed(productoItem);
		
	}
}
