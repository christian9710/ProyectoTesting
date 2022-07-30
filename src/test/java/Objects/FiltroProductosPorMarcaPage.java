package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FiltroProductosPorMarcaPage extends BasePage{

    By btnAbarrotes =  By.xpath("html/body/am-main/div[2]/am-home/am-explore-products/div/section/div/div/div[2]/div/div/drag-scroll/div/div[1]/am-product-category/div/div[1]/img");
    By btnDesplegarMarcas = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[4]/div[1]/img");
    By marcaDelMonte = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[4]/div[2]/div[2]/div");
    By lataMelocoton = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[2]/div/div[2]/div/div[3]/am-product-list/div/div/div/div/div/div[3]/a/span");
    
    public FiltroProductosPorMarcaPage(WebDriver driver){
        super(driver);
    }

    public void clickOpcionAbarrotes() {
        click(btnAbarrotes);
    }
    public void clickOpcionVerMarcas() {
        click(btnDesplegarMarcas);
    }
    public void seleccionarMarcaDelMonte() {
        click(marcaDelMonte);
    }
    public boolean encontrarLataMelocoton() {
    	return isDisplayed(lataMelocoton);
    }
 

}