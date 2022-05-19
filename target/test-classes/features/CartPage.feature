@allAppFeatures @cartPageFeatures
Feature: Cart Page features

  @addDeleteButtonsCheck
  Scenario: Add and delete items
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    * I add to cart one more item and delete
    Then I check if item is added
    * I delete all items
    Then I check that no item left
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

  @priceCounterCheck
  Scenario Outline: Price counter check
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    Then Checks if price have correct "<amount>"
    * I add first item
    Then Checks if price have correct "<sum>"
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | amount | sum |
      |     80 | 110 |

  @requiredDeliveryMethodCheck
  Scenario Outline: Required delivery method check
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    * Select the payment method
    * Press order button
    Then Checks if there is "<name>" warning sign
    * Clicks on x button of this worning sign
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | name    |
      | delivery|

  @buyersDetailsHaveBeenFilledInCheck
  Scenario: Buyers details filled in check
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    Then Checks name, house number, post code, town, email field
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

  @recipientsDetailsErrorMessageCheck
  Scenario Outline: Recipients details error message check
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    * Select the delivery method
    * Select the payment method
    * Fill in the recipients details with blank "<name>" field
    * Press order button
    Then Checks if there is "<name>" warning sign
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

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
    Given I navigate to the application
    When I Log in, put products to cart and navigate to cart page
    * Select the delivery method
    * Select the payment method
    * Fill in telephone input
    * Press order button
    Then I check order confirmation text
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu
