package Objects.Secciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Objects.BasePage;

public class RecetasPage extends BasePage {

	By btnRecetas = By.xpath("/html/body/am-main/div[2]/am-home/am-home-menu/nav/div/ul/li[3]/a\r\n");
	By labelAcompa = By.xpath("/html/body/am-main/div[2]/am-recipe/div[2]/div[1]/div/ul/li[2]/span\r\n");
	public RecetasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
 
	public void ClickSeccionRecetas()
	{
	 click(btnRecetas);	
		
	}
	
	public boolean EncontrarAcompa()
	{
	    return isDisplayed(labelAcompa);
	}
}
