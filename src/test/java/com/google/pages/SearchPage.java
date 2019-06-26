package com.google.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {
	@FindBy(css = "[title*='Search']")
	private WebElementFacade inputfield;

	@FindBy(css = "[jsname*='VlcLAe'] [value*='Google Search']")
	private WebElementFacade searchbutton;

	public void enterSerachInputs(String url) {
		this.inputfield.waitUntilPresent();
		this.inputfield.isEnabled();
		this.inputfield.clear();
		this.inputfield.sendKeys(url);

	}
	
	public void clickSeachButton() {
		this.searchbutton.click();
	}
	public void launchPage(String url) {
		this.openUrl(url);
	}
}
