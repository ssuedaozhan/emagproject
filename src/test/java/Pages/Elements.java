package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{
    public Elements(){
        PageFactory.initElements(PageDriver.getDriver(),this);
    }



    @FindBy(css="[id='searchboxTrigger']")
    public  WebElement search;

    @FindBy(css = "[class='btn btn-default searchbox-submit-button']")
    public  WebElement clicksearch;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement sepeteekle;

    @FindBy(xpath = "(//*[@data-dismiss='modal'])[1]")
    public WebElement carpiisareti;

    @FindBy(css = "[class='em em-cart2 navbar-icon']")
    public WebElement anasayfadakisepetegider;


    @FindBy(xpath = "(//*[@class='btn btn-link btn-remove-product gtm_rp080219 remove-product'])[1]")
public WebElement sterge;



}
