#Author: your.email@your.domain.com
Feature: Mobile Purchase in flipkart application

 Scenario: Buy Mobile
 Given user launches flipkart application
 And user login by entering crendentials
 When user search mobile
 And user click on the mobile name
 Then user click on add to cart
 
 Scenario: Buy Mobile with one dim Map
 Given user launches flipkart application
 And user login by entering crendentials
 When user search mobile by using one dim map
 | sam  | samsung |
 | i    | iphone  |
 | real | realme  |
 And user click on the mobile name
 Then user click on add to cart
