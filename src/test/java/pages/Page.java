package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public Page(final WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return driver;
    }

    protected WebDriverWait getWait(){
        return wait;
    }
}
