package com.bitrix.page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStream {


    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Like']")
    public List<WebElement> likebutton;

    @FindBy(xpath = "//a[.='Comment']")
    public  List<WebElement> commentbutton;

    @FindBy(xpath = "//div[@class='feed-post-informers-cont']//a[@class='bx-ilike-text']")
    public List<WebElement> submitbutton;

    @FindBy(xpath = "//div[@class='feed-post-informers-cont']//div[@data-reaction='like']")
    public List<WebElement> likeIkon;




}
