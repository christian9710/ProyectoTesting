package Objects.BusquedaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class OrdenarProductosPorPrecioPage extends BasePage{
	 	By btComidasPreparadas =  By.xpath("/html/body/am-main/div[2]/am-home/am-explore-products/div/section/div/div/div[2]/div/div");
	    By btnDesplegarOrdenarPrecio = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[5]/div[1]/img");
	    By btnCongelados = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[2]/div/div[1]/ul/am-button-filter[3]/li/a");
	    By btnPrecioMenorAMayor = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[5]/div[2]/div[1]/div/div");
	    By btnPrecioMayorAMenor= By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[5]/div[2]/div[2]/div/div");
	    
	    public OrdenarProductosPorPrecioPage(WebDriver driver){
	        super(driver);
	    }

	    public void clickOpcioComidasPreparadas() {
	        click(btComidasPreparadas);
	    }
	    public void clickSushi() {
	        click(btnCongelados);
	    }
	    public void clickOpcionOrdenarPorPrecio() {
	        click(btnDesplegarOrdenarPrecio);
	    }
	    public void seleccionarDeMenorAMayor() {
	        click(btnPrecioMenorAMayor);
	    }
	    public void seleccionarDeMayorAMenor() {
	        click(btnPrecioMayorAMenor);
	    }

}
