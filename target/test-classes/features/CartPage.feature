@allAppFeatures @cartPageFeatures
Feature: Cart Page features

  @addDeleteButtonsCheck
  Scenario: Add and delete items
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
    And Add to cart one more item and delete 
    Then User checks if item is added
    And Deletes all items
    Then User checks that no item left
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
	@priceCounterCheck
  Scenario Outline: Price counter check
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
		Then Checks if price have correct "<amount>"
    And Add first item
    Then Checks if price have correct "<sum>"
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
      Examples: 
      | amount | sum |
      | 80     | 110 |
      
  @requiredDeliveryMethodCheck
  Scenario Outline: Required delivery method check
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
    And Select the payment method
    And Press order button
    Then Checks if there is "<name>" warning sign
    And Clicks on x button of this worning sign
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
    	Examples: 
      | name          |
      | paymentMethod |
    
  @buyersDetailsHaveBeenFilledInCheck
  Scenario: Buyers details filled in check
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
    Then Checks name, house number, post code, town, email field
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
    
  @recipientsDetailsErrorMessageCheck
  Scenario Outline: Recipients details error message check
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
    And Select the delivery method
    And Select the payment method
    And Fill in the recipients details with blank "<name>" field
    And Press order button
    Then Checks if there is "<name>" warning sign
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
	    Examples: 
      | name      |
      | userName  |
      | street    |
      | postCode  |
      | town      |
      | email     |
      | telephone |
      
  @validOrderCheck
  Scenario: Valid order check
  	Given User navigates to the application
    When Logged in user put products to cart and navigate to cart page
    And Select the delivery method
    And Select the payment method
    And Fill in telephone input
    And Press order button
 		Then Checks order confirmation text
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
   
