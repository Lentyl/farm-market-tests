@allAppFeatures @userPanelPageFeatures
Feature: User panel page feature

  @userInformationCheck
  Scenario Outline: Warning message check
    Given User navigates to the application
    When Logged in "<status>" user goes to user panel
    Then Checks user information fields
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | status   |
      | business |

  @warningMessageCheck
  Scenario Outline: Warning message check
    Given User navigates to the application
    When Logged in "<status>" user goes to user panel
    And Clicks on the pencil icon button
    Then Checks if edit panel is open
    And Changes town name on "<warszawa>"
    And Clicks on confirm button
    Then Checks town warning  message content
    And Clicks x button in the warning message
    And Changes town name on "<plonsk>"
    And Changes email
    And Clicks on confirm button
    Then Checks email warning message content
    And Clicks x button in the warning message
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | status   | warszawa | plonsk |
      | business | Warszawa | Płońsk |

  @addAndDeleteItemCheck
  Scenario Outline: Warning message check
    Given User navigates to the application
    When Logged in "<status>" user goes to user panel
    And Clicks on the pencil icon button
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | status   | productName |
      | business | winogrono   |

  @addOrderAndCheckIfDetailsAreCorrect
  Scenario Outline: Warning message check
    Given User navigates to the application
    When Logged in "<status>" user goes to user panel
    Then Checks if orders arent present
    And Navigate to the home page
    And User types "<product>" name
    And Choose product
    And Clicks on the product details button
    Then User is send to product seller details tab
    And Add products to cart, one of each kind
    And Navigate to cart Page
    And Select the delivery method
    And Select the payment method
    And Fill in telephone input
    And Press order button
    Then Checks order confirmation text
    And User goes to user panel
    Then Checks if header is correct
    And Clicks order details link
    Then User goes to order detail card and checks order details
    And Clicks seller details button
    Then Checks seller details
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | status   | product |
      | business | jabłko  |

  @businessPanelDisplayedCheck
  Scenario Outline: log in private user and check if panel is displayed
    Given User navigates to the application
    When Logged in "<status>" user goes to user panel
    Then Check if business panel isnt displaying
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | status  |
      | private |
