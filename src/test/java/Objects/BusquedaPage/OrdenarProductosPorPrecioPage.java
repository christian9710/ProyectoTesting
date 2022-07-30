package Objects.BusquedaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class OrdenarProductosPorPrecioPage extends BasePage{
	 	By btnBebidas =  By.xpath("/html/body/am-main/div[2]/am-home/am-explore-products/div/section/div/div/div[2]/div/div/drag-scroll/div/div[3]/am-product-category/div/div[1]/img");
	    By btnDesplegarOrdenarPrecio = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[4]/div[1]/img");
	    By marcaDelMonte = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[1]/am-product-filter/div[4]/div[2]/div[2]/div");
	    By lataMelocoton = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[2]/div/div[2]/div/div[3]/am-product-list/div/div/div/div/div/div[3]/a/span");
	    
	    public OrdenarProductosPorPrecioPage(WebDriver driver){
	        super(driver);
	    }

	    public void clickOpcionBebidas() {
	        click(btnBebidas);
	    }
	    public void clickOpcionOrdenarPorPrecio() {
	        click(btnDesplegarOrdenarPrecio);
	    }
	    public void seleccionarDeMenorAMayor() {
	        click(marcaDelMonte);
	    }
	    public void seleccionarDeMayorAMenor() {
	        click(marcaDelMonte);
	    }
	    public boolean encontrarLataMelocoton() {
	    	return isDisplayed(lataMelocoton);
	    }

}
