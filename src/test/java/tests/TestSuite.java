package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import property.BaseTest;

public class TestSuite extends BaseTest {
    @Test
    public void checkTextOfButtonEnter(){
        actions.openLoginForSubcsribe();
        Assert.assertEquals("ВОЙТИ", actions.getTextOfEnterForSubscribe());
    }
}
