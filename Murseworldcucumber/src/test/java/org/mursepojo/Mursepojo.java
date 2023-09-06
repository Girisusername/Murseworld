package org.mursepojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Mursepojo extends Baseclass {
public Mursepojo() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindAll({
	@FindBy(xpath="//li[@class='authorization-link']")
})
private WebElement Signupclick;

@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@name='login[username]']")
})
private WebElement Username;

@CacheLookup
@FindAll({
	@FindBy(xpath="//input[@name='login[password]']")
})
private WebElement password;

@CacheLookup
@FindBys({
	@FindBy(xpath="(//span[text()='Sign In'])[2]")
})
private WebElement signin;

@CacheLookup
@FindBys({
	@FindBy(xpath="//span[text()='Scrub Jackets']")
})
private WebElement Scrubjack;

@CacheLookup
@FindBys({
	@FindBy(xpath="(//a[@class='level-top ui-corner-all'])[4]")
})
private WebElement brandclick;

@CacheLookup
@FindBys({
	@FindBy(xpath="(//li[@class='item'])[8]")
})
private WebElement clickpro;

@CacheLookup
@FindBys({
	@FindBy(xpath="//a[@class='product-item-link']")
})
private WebElement prodclick;

@CacheLookup
@FindBys({
	@FindBy(xpath="(//div[@role='option'])[3]")
})
private WebElement colourchoose;

@CacheLookup
@FindBys({
	@FindBy(xpath="//div[text()='4XL']")
})
private WebElement sizechoose;

@CacheLookup
@FindBys({
	@FindBy(xpath="//button[@title='Add to Cart']")
})
private WebElement addtocart;

public WebElement getSignupclick() {
	return Signupclick;
}

public WebElement getUsername() {
	return Username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignin() {
	return signin;
}

public WebElement getScrubjack() {
	return Scrubjack;
}

public WebElement getBrandclick() {
	return brandclick;
}

public WebElement getClickpro() {
	return clickpro;
}

public WebElement getProdclick() {
	return prodclick;
}

public WebElement getColourchoose() {
	return colourchoose;
}

public WebElement getSizechoose() {
	return sizechoose;
}

public WebElement getAddtocart() {
	return addtocart;
}









}