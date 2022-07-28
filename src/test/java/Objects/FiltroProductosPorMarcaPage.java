package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiltroProductosPorMarcaPage extends BasePage{


    By btnCategorias = By.xpath("//span[@class='menu-bg wText' and @id = 'boton-categorias' and text()= 'Comprá por categorías']");
    By btnAbarrotes = By.xpath("//li[contains(text(), 'Abarrotes') and @class='multilevel-dropdown-item has-children']");
    By btnCereales = By.xpath("//li[contains(text(), 'Cereales') and @class='multilevel-dropdown-item']");
    By marcaKellogs = By.xpath("//input[@type='checkbox' and @class='ais-RefinementList-checkbox' and @value='KELLOGGS']");
    By btnCongeladosRefrigerados = By.xpath("//li[contains(text(), 'Congelados y refrigerados') and @class='multilevel-dropdown-item has-children']");
    By btnCongelados = By.xpath("//li[contains(text(), 'Congelados') and @class='multilevel-dropdown-item']");
    By marcaEggo = By.xpath("//input[@type='checkbox' and @class='ais-RefinementList-checkbox' and @value='EGGO']");


    public FiltroProductosPorMarcaPage(WebDriver driver){
        super(driver);
    }

    public void clickCategorias() {
        click(btnCategorias);
    }
    public void clickOpcionAbarrotes() {
        click(btnAbarrotes);
    }
    public void clickOpcionCereales() {
        click(btnCereales);
    }
    public void seleccionarMarcaCerales() {
        click(marcaKellogs);
    }
    public void clickOpcionCongeladosRefrigerados() {
        click(btnCongeladosRefrigerados);
    }
    public void clickOpcionCongelados() {
        click(btnCongelados);
    }
    public void seleccionarMarcaCongelados() {
        click(marcaEggo);
    }
}
