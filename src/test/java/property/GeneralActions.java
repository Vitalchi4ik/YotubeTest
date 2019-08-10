package property;

import org.openqa.selenium.WebDriver;
import pages.ChannelPage;
import pages.MainPage;
import pages.VideoListPage;
import pages.VideoPage;

public class GeneralActions {
    private final WebDriver driver;
    private VideoPage videoPage;
    private VideoListPage videoListPage;
    private ChannelPage channelPage;

    public GeneralActions(final WebDriver driver){
        this.driver = driver;
    }

    public void openLoginForSubcsribe(){
        MainPage mainPage = new MainPage(driver);
            mainPage.open()
            .enterTestValue("This Text Will be Deleted")
            .clearEnteredTestValue();
            this.videoListPage = mainPage.clickSecondSearchResult("" + (int)(Math.random()*1000));
            this.videoPage = videoListPage.clickFourthVideo();
            channelPage = videoPage.clickOnAvatar()
                    .clickSubscribeButton();
    }

    public String getTextOfEnterForSubscribe(){
        ChannelPage channelPage = new ChannelPage(driver);
        return channelPage.getEnterButtonText();
    }
}
