package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class TechGlobalPaginationPage extends TechGlobalBasePage {
    public TechGlobalPaginationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // Task-1
    @FindBy(id = "main_heading")
    public WebElement mainHeading;

    @FindBy(id = "sub_heading")
    public WebElement subHeading;

    @FindBy(id = "content")
    public WebElement paragraph;

    // Task-2
    @FindBy(id = "previous")
    public WebElement previousButton;

    @FindBy(id = "next")
    public WebElement nextButton;

    // Task-3
    @FindBy(css = ".Pagination_pagBodyData__up2c0 p")
    public List<WebElement> cityInfo;
}
