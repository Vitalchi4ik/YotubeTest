package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Properties;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MainPage extends Page{
    public MainPage(final WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage open(){
        getDriver().get(Properties.getBaseUrl());
        return this;
    }

    @CacheLookup
    @FindBy(name = "search_query")
    private WebElement searchField;

    @FindBy(css = "ul.sbsb_b li:nth-child(2).sbsb_c.gsfs")
    private WebElement secondSearchReult;


    public WebElement waitForSearchFieldDisplays(){
        getWait().until(visibilityOf(searchField));
        return searchField;
    }

    public MainPage enterTestValue(String deletedValue){
        getWait().until(visibilityOf(searchField));
        searchField.sendKeys(deletedValue);
        return this;
    }

    public MainPage clearEnteredTestValue(){
        getWait().until(visibilityOf(searchField));
        searchField.clear();
        return this;
    }

    public VideoListPage clickSecondSearchResult(String randomNumber){
        getWait().until(visibilityOf(searchField));
        searchField.sendKeys(randomNumber);
        getWait().until(visibilityOf(secondSearchReult));
        secondSearchReult.click();
        return PageFactory.initElements(getDriver(), VideoListPage.class);
    }
}
