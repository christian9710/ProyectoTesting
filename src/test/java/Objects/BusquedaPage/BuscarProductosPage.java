package Objects.BusquedaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class BuscarProductosPage extends BasePage {
    public By inputBusqueda = By.xpath("//input[@class='ais-SearchBox-input' and @type = 'search' and @placeholder= 'Buscá un producto']");
    By btnCategorias = By.xpath("//span[@class='menu-bg wText' and @id = 'boton-categorias' and text()= 'Comprá por categorías']");
    By btnLacteosEmbutidos = By.xpath("//li[contains(text(), 'Lacteos y embutidos') and @class='multilevel-dropdown-item has-children']");
    By btnOpcionLeche = By.xpath("//li[contains(text(), 'Leche') and @class='multilevel-dropdown-item']");

    public BuscarProductosPage(WebDriver driver){
        super(driver);
    }

    public void clickInputBusqueda() {
        click(inputBusqueda);
    }
    public void clickCategorias() {
        click(btnCategorias);
    }
    public void clickOpcionLacteosEmbutidos() {
        click(btnLacteosEmbutidos);
    }
    public void clickOpcionLeche() {
        click(btnOpcionLeche);
    }
    public void ingresarProducto(String producto) {
        sendKeys(inputBusqueda, producto);
    }
}
