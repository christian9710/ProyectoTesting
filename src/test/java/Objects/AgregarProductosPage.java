package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgregarProductosPage extends BasePage{
	  By InputBusqueda = By.xpath("//div[@class='col-md-3 select-delivery']/following-sibling::div/div/div/form/input[@class='ais-SearchBox-input']");
      By btnBusqueda = By.xpath("//div[@class='col-md-3 select-delivery']/following-sibling::div/div/div/form/button[@class='ais-SearchBox-submit']");
      By ModalAudioTutorial = By.xpath("//img[@ng-click='onCloseAudioTutorialModal()']");
      By btnAgregar = By.xpath("//button[@data-objectid='354040d2-03ec-e911-a986-000d3a30d0ca']");
      By btnAgregarProductolimon =  By.xpath("//span[@id='button-106626']");
      By btnAgregarProductoPano =  By.xpath("//span[@id='button-046553']");
      By btnAgregarProductoCarne =  By.xpath("//button[@data-objectid='017681fe-30fd-e811-a970-000d3a3026d6']");
      By btnAgregarMas =  By.xpath("//button[@class='btn cart-summary-btn']");
      By btnAgregarProductoMoet =  By.xpath("//button[@data-objectid='ca28856b-33fd-e811-a973-000d3a3099e5']");


      public AgregarProductosPage(WebDriver driver){

        super(driver);

      }

      public void buscarProducto(String producto) {

          sendKeys(InputBusqueda, producto);
          click(btnBusqueda);
          click(ModalAudioTutorial);
          click(btnAgregar);

      }

      public void btnAgregarProductolimon() {

          click(btnAgregarProductolimon);

      }

	  public void btnAgregarProductoPano() {
	
	      click(btnAgregarProductoPano);
	
	  }
	  public void btnAgregarProductoCarne() {
	
	      click(btnAgregarProductoCarne);
	
	  }
	
	  public void btnAgregarMas() {
	
	      click(btnAgregarMas);
	
	  }
	
	
	  public void btnAgregarProductoMoet() {
	
	    click(btnAgregarProductoMoet);
	
	  }
}
