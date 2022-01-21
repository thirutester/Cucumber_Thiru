package com.flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
 @Before
 public void BeforeScenario() {
	 System.out.println("Before Annotation");
 }
 @After
 public void AfterScenario() {
	 System.out.println("After Scenario");
 }
 
}
