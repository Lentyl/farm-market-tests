@allAppFeatures @businessSignupPageFeatures
Feature: Product Page features

  @businessSignUpWithoutMarkingConfirmationCheckbox
  Scenario Outline: Business sign up with empty Name field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    * I fill in credentials without marking confirmation checkbox
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithInvalidEmail
  Scenario Outline: Business sign up with invalid email
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with invalid email
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyNameField
  Scenario Outline: Business sign up with empty Name field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty password field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyPasswordField
  Scenario Outline: Business sign up with empty password field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty Name field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I add product "<productName>"
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyEmailField
  Scenario Outline: Business sign up with empty email field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty email field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithPostecodeField
  Scenario Outline: Business sign up with empty postcode field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty postecode field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithCityField
  Scenario Outline: Business sign up with empty city field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty city field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithStreetField
  Scenario Outline: Business sign up with empty street field
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials with empty street field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithCorrectCredentials
  Scenario Outline: Business sign up with correct credentials
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials fields with correct data
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, appears on the page
    * I click submit button
    * Accepts alert message
    Then I am signed in, confirmation inscription appears
    * I click on log out button
    * I navigate to the home page by url
    Then I check if I am logged out and there is log in dropdown menu
    

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |
