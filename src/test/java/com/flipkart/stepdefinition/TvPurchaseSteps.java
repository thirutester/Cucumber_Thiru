package com.flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;


public class TvPurchaseSteps {
	@When("user search tv")
	public void user_search_mobile() throws Throwable {
		System.out.println("Scenario");
		WebElement search = MobilePurchaseSteps.d.findElement(By.xpath("//input[@type='text']"));
	  	search.sendKeys("SAMSUNG tv",Keys.ENTER);
	    Thread.sleep(2000);
	  	WebElement mobileName = MobilePurchaseSteps.d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	    Thread.sleep(2000);
		String name = mobileName.getText();
		System.out.println(name);
		mobileName.click();
	  	
	}
	

}
