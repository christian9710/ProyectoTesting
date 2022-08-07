package Objects.FiltrosProductos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class SeleccionProductos extends BasePage {
    public By btnProducto = By.xpath("/html/body/am-main/div[2]/am-home/am-explore-products/div/section/div/div/div[2]/div/div/drag-scroll/div/div[1]/am-product-category/div");
    public By btnAgregarProducto = By.xpath("//*[@id=\"add-to-cart-100166\"]");
    public By inputCorreo = By.xpath("//*[@id=\"email\"]");
    public By inputPassword = By.xpath("//*[@id=\"password\"]");
    public By confirmacion = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[4]/am-button");
    public By modalTipoEntrega = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-method/div/div[2]/div[2]/div/div[1]/am-method-card/div/div[2]/div[1]/h4");
    public By cerrarModal = By.xpath("//button[@class='btn am-button solid ng-star-inserted']");
    
	public SeleccionProductos (WebDriver driver){
        super(driver);
    }
	
	public void clickBtnCategoria() {
		click(btnProducto);
	}
	
	
	public void clickBody () {
		click(cerrarModal);
	}
	
	public void clickBtnProducto() {
		click(btnAgregarProducto);
	}
	
	public void clickBtnInicioSesion() {
		click(confirmacion);
	}
	
    public void llenarInputCorreo(String correo)
    {
        sendKeys(inputCorreo,correo);
    }
    
    public void llenarInputContrasena(String contrasena)
    {
        sendKeys(inputPassword,contrasena);
    }
    
    public boolean encontrarModal () {
    	return isDisplayed(modalTipoEntrega);
    }
}
