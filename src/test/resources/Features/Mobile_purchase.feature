#Author: your.email@your.domain.com
@Mobile @regression @sanity
Feature: Mobile Purchase in flipkart application

 Background:
 Given user launches flipkart application
 And user login by entering crendentials
 
 Scenario: Buy Mobile
 When user search mobile
 And user click on the mobile name
 Then user click on add to cart
 
 Scenario Outline:
 When user search mobile "<Phone>"
 And user click on the mobile name
 Then user click on add to cart
 
 Examples:
 | Phone   |
 | iPhone  |
 | realme Narzo |
