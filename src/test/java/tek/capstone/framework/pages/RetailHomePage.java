package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);	
	}
	
	@FindBy(xpath="//a[contains(text(),'TEKSCHOOL')]")
	public WebElement tekSchoolLogo;
	
	@FindBy(id="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(id="searchInput")
	public WebElement searchBar;
	
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@FindBy(id="signinLink")
	public WebElement signInButton;
	
	@FindBy(xpath="//p[contains(text(),'Cart')]")
	public WebElement cartButton;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")
	public WebElement pokemanProductImage;


	
	

}
