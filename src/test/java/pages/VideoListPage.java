package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class VideoListPage extends Page{

    public VideoListPage(final WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ytd-video-renderer:nth-child(4) a#video-title.yt-simple-endpoint.style-scope.ytd-video-renderer")
    private WebElement fourthVIdeo;

    public VideoPage clickFourthVideo(){
        getWait().until(visibilityOf(fourthVIdeo));
        fourthVIdeo.click();
        return PageFactory.initElements(getDriver(), VideoPage.class);
    }

}
