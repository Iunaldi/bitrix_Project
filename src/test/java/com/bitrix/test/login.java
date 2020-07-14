package com.bitrix.test;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import com.bitrix.page.ActivityStream;
import com.bitrix.page.loginpage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class login {
    loginpage loginpageelement;
    ActivityStream activityStream;

    @BeforeMethod
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginpageelement=new loginpage();

        loginpageelement.loginname.sendKeys(ConfigurationReader.getProperty("username"));
        loginpageelement.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginpageelement.submitbutton.click();
    }

    @Test
    public void likeButton() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        activityStream=new ActivityStream();
        Thread.sleep(5000);
        activityStream.likebutton.get(0).click();
        Thread.sleep(5000);
        WebElement like=activityStream.likeIkon.get(0);

        Assert.assertTrue(like.isDisplayed());

    }

}
