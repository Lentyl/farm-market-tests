@allAppFeatures @businessSignupPageFeatures
Feature: Product Page features

  @businessSignUpWithEmptyNameField
  Scenario Outline: Business sign up with empty Name field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty password Field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks red cancel button to delete product
    Then Product disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithEmptyPasswordField
  Scenario Outline: Business sign up with empty password field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty Name Field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks red cancel button to delete product
    Then Product disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithEmptyEmailField
  Scenario Outline: Business sign up with empty password field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty email Field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks red cancel button to delete product
    Then Product disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithPostecodeField
  Scenario Outline: Business sign up with empty password field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty postecode Field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks red cancel button to delete product
    Then Product disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithCorrectCredentials
  Scenario Outline: Business sign up with correct credentials
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials fields with correct data
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks red cancel button to delete product
    Then Product disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    And Accepts alert message
    Then User is signed in, confirmation inscription appears

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |
