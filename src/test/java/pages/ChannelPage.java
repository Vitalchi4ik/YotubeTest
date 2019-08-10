package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ChannelPage extends Page {

    public ChannelPage(final WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div#channel-header-container a.ytd-button-renderer")
    private WebElement subscribe;

    @FindBy(xpath = "//yt-formatted-string[@id='text' and @class='style-scope ytd-button-renderer style-blue-text size-default']")
    private WebElement enterButton;


    public ChannelPage clickSubscribeButton(){
        getWait().until(visibilityOf(subscribe));
        subscribe.click();
        return this;
    }

    public String getEnterButtonText(){
        getWait().until(visibilityOf(enterButton));
        return enterButton.getText();
    }
}
