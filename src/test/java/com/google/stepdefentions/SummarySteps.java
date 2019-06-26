package com.google.stepdefentions;

import com.google.pages.SearchPage;
import net.thucydides.core.annotations.Step;
public class SummarySteps {
	
SearchPage searchPage ;
@Step
public void launchGoogleTest() {
	searchPage.launchPage("https://www.google.com");

}
@Step 
public void enterKeyword(String arg1)
{
	searchPage.enterSerachInputs(arg1);
}
@Step 
public void clickSearchButton()
{
	searchPage.clickSeachButton();
}
}
