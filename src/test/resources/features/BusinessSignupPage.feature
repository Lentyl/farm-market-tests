@allAppFeatures @businessSignupPageFeatures 
Feature: Product Page features
 
  @businessSignUpWithEmptyNameField
  Scenario Outline: Business sign up with empty Name field
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
    Then User is signed in, confirmation inscription appears

    Examples: 
      | link | name           | productName |
      |	sell | businessSignUp | kalafior    |


