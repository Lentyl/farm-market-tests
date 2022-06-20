@allAppFeatures @businessSignupPageFeatures
Feature: Product page features

  @businessSignUpWithoutMarkingConfirmationCheckbox
  Scenario Outline: Business sign up with empty Name field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    * I fill in credentials without ticking the confirmation checkbox
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithInvalidEmail
  Scenario Outline: Business sign up with invalid email
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in credentials using invalid email address
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyNameField
  Scenario Outline: Business sign up with empty Name field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the name field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyPasswordField
  Scenario Outline: Business sign up with empty password field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the password field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I add product "<productName>"
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithEmptyEmailField
  Scenario Outline: Business sign up with empty email field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the email field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product 
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithPostecodeField
  Scenario Outline: Business sign up with empty postcode field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the postecode field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithCityField
  Scenario Outline: Business sign up with empty city field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the city field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithStreetField
  Scenario Outline: Business sign up with empty street field
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credentials except the street field
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |

  @businessSignUpWithCorrectCredentials
  Scenario Outline: Business sign up with correct credentials
    Given I navigate to the application
    When I click the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I fill in all credential fields with the correct data
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click the red cancel button to delete "<productName>" product
    Then "<productName>" disappears from the list
    * I add product "<productName>"
    Then "<productName>" is added to seller offer, it appears on the page
    * I click submit button
    * Accept alert message
    Then I am signed in, confirmation inscription appears
    * I click the log out button
    * I navigate to the home page by url
    Then I check if I am logged out and there is log in dropdown menu
    

    Examples: 
      | linkName | pageName       | productName |
      | sell     | businessSignUp | kalafior    |
