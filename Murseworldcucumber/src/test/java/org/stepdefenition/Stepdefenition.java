package org.stepdefenition;

import org.base.Baseclass;
import org.mursepojo.Mursepojo;
import org.openqa.selenium.JavascriptExecutor;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition extends Baseclass {
	@Given("user have to check launch the url")
	public void userHaveToCheckLaunchTheUrl() {
	   launchchrome();
	   launchurl("https://www.murseworld.com/");maximize();implicitwait(10000);
	}

	@When("user have to login with valid email and password")
	public void userHaveToLoginWithValidEmailAndPassword() throws InterruptedException {
	   Mursepojo m = new Mursepojo();
	   click(m.getSignupclick());
	   sendkeys(m.getUsername(), "Mailgirisinbox@gmail.com");
	   sendkeys(m.getPassword(), "Mailgiri@12");
	   Thread.sleep(7000);
	   JavascriptExecutor jk = (JavascriptExecutor) driver;
       jk.executeScript("arguments[0].click()", m.getSignin());
	}

	@When("user have to choose the product")
	public void userHaveToChooseTheProduct() {
		 Mursepojo m = new Mursepojo();
		 click(m.getScrubjack());click(m.getBrandclick());
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click()", m.getClickpro());
	}

	@When("user have to select the size and colour")
	public void userHaveToSelectTheSizeAndColour() {
		 Mursepojo m = new Mursepojo();
		 click(m.getProdclick());
		 click(m.getColourchoose());click(m.getSizechoose());
		 

	}

	@Then("user have to click the add to cart")
	public void userHaveToClickTheAddToCart() {
		Mursepojo m = new Mursepojo();
		click(m.getAddtocart());
	}

	@Given("user have to launch the murseworld URL")
	public void userHaveToLaunchTheMurseworldURL() {
		launchchrome();
		   launchurl("https://www.murseworld.com/");maximize();implicitwait(10000);
	}

	@When("user have to enter the valid {string} and valid {string}")
	public void userHaveToEnterTheValidAndValid(String email, String password) {
		Mursepojo m = new Mursepojo();
		click(m.getSignupclick());
		sendkeys(m.getUsername(), email);
		sendkeys(m.getPassword(), password);
		 
	}

	@When("user have to click the signin button")
	public void userHaveToClickTheSigninButton() throws InterruptedException {
		Mursepojo m = new Mursepojo();
		Thread.sleep(7000);
		   JavascriptExecutor jk = (JavascriptExecutor) driver;
	       jk.executeScript("arguments[0].click()", m.getSignin());
	}

	@Then("user have to verify the signin functionlity")
	public void userHaveToVerifyTheSigninFunctionlity() {
	    if (driver.getCurrentUrl().equals("https://www.murseworld.com/")) {
			System.out.println("Valid");
		} else {
            System.out.println("Invalid");
		}
	}

}
