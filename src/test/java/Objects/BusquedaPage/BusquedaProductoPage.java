package Objects.BusquedaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class BusquedaProductoPage extends BasePage{
	
    public By inputBusqueda = By.xpath("//input[@class='dropdown-toggle form-control am-shadow am-shadow-lg-none w-100' and @type = 'search' and @placeholder= 'Buscá un producto']");
    By btnResultado = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[2]/li/am-product-search-navbar/form/div/ul/li[1]/am-product-search-list/a/em");
    By chocolateResult = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[2]/div/div[3]/div/div[1]/am-product-list/div/div/div/div/div/div[3]/a/span");
    	
    public BusquedaProductoPage(WebDriver driver){
        super(driver);
    }

    public void clickInputBusqueda() {
        click(inputBusqueda);
    }
    public void buscarProducto(String producto) {
        sendKeys(inputBusqueda, producto);
    }
    public void clickResultado() {
    	click(btnResultado);
    }
    public boolean encontrarResultado() {
    	return isDisplayed(chocolateResult);
    }

}
 