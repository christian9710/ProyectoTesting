package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaProductoPage extends BasePage{
	
    public By inputBusqueda = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[2]/li/am-product-search-navbar/form/span/input");

    public BusquedaProductoPage(WebDriver driver){
        super(driver);
    }

    public void clickInputBusqueda() {
        click(inputBusqueda);
    }
    public void ingresarProducto(String producto) {
        sendKeys(inputBusqueda, producto);
    }
    
    public void presionarEnter() {
    	pressEnterOnElement(inputBusqueda);
    }

}
 