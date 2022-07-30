package Objects.CarritoComprasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class AgregarProductosDesdeListaComprasPage extends BasePage {
	
	 public By btnAgregarProductosLista = By.xpath("//button[@ng-click=\"addAllProducts('list',detail_list.listId)\"]");

	    public AgregarProductosDesdeListaComprasPage(WebDriver driver) {
	        super(driver);
	    }

}
