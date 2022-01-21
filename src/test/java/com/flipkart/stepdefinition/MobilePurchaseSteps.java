package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MobilePurchaseSteps {
	static WebDriver d;
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		    System.out.println("Background");
			WebDriverManager.chromedriver().setup();
	        d = new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://www.flipkart.com/");
		
	}

	@Given("user login by entering crendentials")
	public void user_login_by_entering_crendentials() {
		try {
	   		WebElement button = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	   		 button.isDisplayed();
	   	     button.click();
	   	}catch (Exception e) {
	   		System.out.println("Popup not displayed");
	   	}
	}

	@When("user search mobile")
	public void user_search_mobile() throws Throwable {
		System.out.println("Scenario");
		WebElement search = d.findElement(By.xpath("//input[@type='text']"));
	  	search.sendKeys("realme",Keys.ENTER);
	    Thread.sleep(2000);
	  	WebElement mobileName = d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	    Thread.sleep(2000);
		String name = mobileName.getText();
		System.out.println(name);
		mobileName.click();
	  	
	}

	@When("user click on the mobile name")
	public void user_click_on_the_mobile_name() {
	  	String par = d.getWindowHandle();
	  	Set<String> child = d.getWindowHandles();
			for(String x : child) {
			if(!par.equals(x)) {
					System.out.println("tab switched");
					d.switchTo().window(x);
				}
			}
	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() {
		Assert.assertTrue(d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).isDisplayed());
		d.quit();
	}
	
	/*@When("user search mobile by using {int} dim list")
	public void user_search_mobile_by_using_dim_list(Integer int1, DataTable dataTable) throws Throwable {
	   List<String> datas = dataTable.asList(String.class);
	   WebElement search = d.findElement(By.xpath("//input[@type='text']"));
	  	search.sendKeys(datas.get(1),Keys.ENTER);
	    Thread.sleep(2000);
	  	WebElement mobileName = d.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
	    Thread.sleep(2000);
		String name = mobileName.getText();
		System.out.println(name);
		mobileName.click();
	}  */
	/*@When("user search mobile by using one dim map")
	public void user_search_mobile_by_using_dim_map(DataTable dataTable) throws Throwable {
		   Map<String, String> datas = dataTable.asMap(String.class, String.class);
		   WebElement search = d.findElement(By.xpath("//input[@type='text']"));
		  	search.sendKeys(datas.get("real"),Keys.ENTER);
		    Thread.sleep(2000);
		  	WebElement mobileName = d.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
		    Thread.sleep(2000);
			String name = mobileName.getText();
			System.out.println(name);
			mobileName.click();  
	}*/
   /*@When("user search mobile {string}")
	public void user_search_mobile(String phone_Name) throws Throwable {
	   WebElement search = d.findElement(By.xpath("//input[@type='text']"));
	  	search.sendKeys(phone_Name,Keys.ENTER);
	    Thread.sleep(2000);
	  	WebElement mobileName = d.findElement(By.xpath("(//div[contains(text(), '"+phone_Name+"')])[2]"));
	    Thread.sleep(2000);
		String name = mobileName.getText();
		System.out.println(name);
		mobileName.click();
	}*/
}
