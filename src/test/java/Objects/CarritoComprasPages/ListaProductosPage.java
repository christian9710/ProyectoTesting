package Objects.CarritoComprasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class ListaProductosPage extends BasePage {
	 public By btnVerListaProductos = By.xpath("//div[@ng-click=\"goListDetail(list.listId)\"]/h6[text()=\"Preferidos\"]");

	    public ListaProductosPage(WebDriver driver) {
	        super(driver);
	    }
}
