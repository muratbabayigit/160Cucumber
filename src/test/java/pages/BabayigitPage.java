package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BabayigitPage {
    public BabayigitPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "babayigit")
    public WebElement searchBox;

    @FindBy(xpath = "//aside[@class='title']")
    public WebElement result;
}
