package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
	private WebElement search;

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")
	private WebElement searchbutton;
	

	public void searchbar(String name)
	{
		this.search.sendKeys(name);
	}
	public void clickbutton()
	{
		searchbutton.click();
	}

	
}
