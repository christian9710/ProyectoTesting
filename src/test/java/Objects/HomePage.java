package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage  extends BasePage {


    public By UserButton = By.xpath("//div[@class='icon-cart'][img[@alt='User']]");
    public By IngresarButton = By.xpath("//a[@data-target='#loginModal'][text()='Ingresar'][not(@class='ng-scope')]");
    By CrearCuentaButton = By.xpath("//a[@data-target='#loginModal'][text()='Ingresar'][not(@class='ng-scope')]/following::*[a[@ng-click='gotoRegister();'][text()='Crear una cuenta']]");
    By metodoEntregaButton = By.xpath("//div[@class='row algolia-search']/div/div[@ng-click='showDeliveryMethods(true)']");
    By ElegirSucursalButton = By.xpath("//md-radio-button[@aria-label='AM Plaza del Sol']");
    By ConfirmSucursalButton = By.xpath("//button[@ng-click='saveDeliveryMethod(deliverySelected)']");
    By ElegirEntregaButton = By.xpath("//button[contains(@ng-click,'pickUp')]");
    By PuntosAutoFrecuenteButton = By.xpath("//ul[@ class='dropdown-menu subitems text-left ng-scope']/li/ a[@href='/#/autofrecuente/accountstatus'][text()='Mis puntos Auto Frecuente']");
    By ComprarPorCategoriaButton = By.xpath("//img[@src='../images/lineas.png']");
    By FrutasVerdurasCategoriaOpt = By.xpath(" //li[@class='multilevel-dropdown-item has-children'][text()='Frutas y verduras']");
    By VerdurasCategoriaSubOpt =By.xpath("//li[text()='Frutas']");
    By CerrarReproductorModal =By.xpath("//img[@src='images/audio/close.svg']");
    public By CarritoCompraButton =By.xpath("//div[@ng-controller='automercadoCartController']/div[@ng-click='openSummary();']");
    By ConcluirCompraButton =By.xpath("//a[@ng-click='openSummary()']");
    By TiendaHogarCategoriaOpt = By.xpath(" //li[@class='multilevel-dropdown-item has-children'][text()='Tienda y hogar']");
    By TiendaSubCategoriaOpt =By.xpath("//li[text()='Tienda']");
    public By inputSearch =By.xpath("//input[@class='ais-SearchBox-input']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickUserButton(){

        click(UserButton);
    }

    public void clickIngresarButton()
    {
        click(IngresarButton);

    }

    public void clickCrearCuentaButton()
    {
        click(CrearCuentaButton);

    }


    public void clickMetodoEntregaButton()
    {
        click(metodoEntregaButton);

    }


    public void clickPickUpButton()
    {
        click(ElegirEntregaButton);

    }

    public void ElegirSucursalButton()
    {
        click(ElegirSucursalButton);

    }


    public void ConfirmSucursalButton()
    {
        click(ConfirmSucursalButton);

    }


    public void PuntosAutoFrecuenteButton()
    {
        click(PuntosAutoFrecuenteButton);

    }

    public void ComprarPorCategoriaButton()
    {
        click(ComprarPorCategoriaButton);

    }


    public void FrutasVerdurasCategoriaOpt()
    {
        click(FrutasVerdurasCategoriaOpt);

    }


    public void VerdurasCategoriaSubOpt()
    {
        click(VerdurasCategoriaSubOpt);

    }

    public void CerrarReproductorModal()
    {
        click(CerrarReproductorModal);
    }

    public void CarritoCompraButton()
    {
        click(CarritoCompraButton);

    }
    public void ConcluirCompraButton()
    {
        click(ConcluirCompraButton);

    }
    public void TiendaHogarCategoriaOpt()
    {
        click(TiendaHogarCategoriaOpt);

    }
    public void TiendaSubCategoriaOpt()
    {
        click(TiendaSubCategoriaOpt);

    }


    public void inputSearch(String producto)
    {
        sendKeys(inputSearch,producto);

    }



}