@allAppFeatures @businessSignupPageFeatures
Feature: Product Page features

  @businessSignUpWithoutMarkingConfirmationCheckbox
  Scenario Outline: Business sign up with empty Name field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    And User fill in credentials without marking confirmation checkbox
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithInvalidEmail
  Scenario Outline: Business sign up with invalid email
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with invalid email
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithEmptyNameField
  Scenario Outline: Business sign up with empty Name field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty password field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
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
    When User fill in credentials with empty Name field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithEmptyEmailField
  Scenario Outline: Business sign up with empty email field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty email field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithPostecodeField
  Scenario Outline: Business sign up with empty postcode field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty postecode field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithCityField
  Scenario Outline: Business sign up with empty city field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty city field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |

  @businessSignUpWithStreetField
  Scenario Outline: Business sign up with empty street field
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User fill in credentials with empty street field
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
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
    And User clicks red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    And Add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    When User clicks submit button
    And Accepts alert message
    Then User is signed in, confirmation inscription appears
    And Clicks on log out button

    Examples: 
      | link | name           | productName |
      | sell | businessSignUp | kalafior    |
