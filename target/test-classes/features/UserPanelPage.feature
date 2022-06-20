@allAppFeatures @userPanelPageFeatures
Feature: User panel page feature

  @userInformationCheck
  Scenario Outline: Warning message check
    Given I navigate to the application
    When I am Logged in and have "<status>" I go to user panel
    Then I check user information fields
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | status   |
      | business |

  @warningMessageCheck
  Scenario Outline: Warning message check
    Given I navigate to the application
    When I am Logged in and have "<status>" I go to user panel
    * I click the pencil icon button
    Then I check if edit panel is open
    * I change town name to "<warszawa>"
    * I click confirm button
    Then Check the town warning  message content
    * I click x button in the warning message
    * I change town name to "<plonsk>"
    * I change email
    * I click confirm button
    Then I check email warning message content
    * I click x button in the warning message
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | status   | warszawa | plonsk |
      | business | Warszawa | Płońsk |

  @addAndDeleteItemCheck
  Scenario Outline: Warning message check
    Given I navigate to the application
    When I am Logged in and have "<status>" I go to user panel
    * I click the pencil icon button
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | status   | productName |
      | business | winogrono   |

  @addOrderAndCheckIfDetailsAreCorrect
  Scenario Outline: Warning message check
    Given I navigate to the application
    When I am Logged in and have "<status>" I go to user panel
    Then I check if orders are present
    * I navigate to the home page
    When I type "<product>" name
    * I choose product
    * I click the product details button
    Then I am sent to the product seller details tab
     * I add products to the cart, one of each kind
    * Navigate to the cart page
    * Select the delivery method
    * Select the payment method
    * Fill in telephone input
    * Press order button
    Then I check order confirmation text
    * Go to the user panel
    Then I check if the header is correct
    * Click order details link
    Then I go to the order details card and check order details
    * Click seller details button
    Then I check seller details
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | status   | product |
      | business | jabłko  |

  @businessPanelDisplayedCheck
  Scenario Outline: log in private user and check if panel is displayed
    Given I navigate to the application
    When I am Logged in and have "<status>" I go to user panel
    Then Check if business panel is not displaying
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | status  |
      | private |