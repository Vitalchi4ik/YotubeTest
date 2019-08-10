package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class VideoPage extends Page {

    public VideoPage(final WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div#top-row.style-scope a.ytd-video-owner-renderer")
    private WebElement avatar;

    public ChannelPage clickOnAvatar(){
        getWait().until(visibilityOf(avatar));
        avatar.click();
        return PageFactory.initElements(getDriver(), ChannelPage.class);
    }
}
