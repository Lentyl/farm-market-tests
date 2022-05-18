@allAppFeatures @signinPagefeatures
Feature: Signin Page features

  @signInWithCorrectCredential
  Scenario Outline: Sign in with corect credential
    Given I navigate to the application
    When I click on the "<linkName>" link
    And I sign in with correct credentials
    Then I check, if I am signed in
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithTheSameCredentials
  Scenario Outline: Sign in with the same credentials
    Given I navigate to the application
    When I click on the "<linkName>" link
    And Sign in with the same correct credential
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithEmptyNameInput
  Scenario Outline: Sign in with emty name input
    Given I navigate to the application
    When I click on the "<linkName>" link
    And Sign in with empty name input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | link   |
      | signUp |

  @signInWithEmptyEmailInput
  Scenario Outline: Sign in with emty email input
    Given I navigate to the application
    When I click on the "<linkName>" link
    And Sign in with empty email input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithEmptyPassword
  Scenario Outline: Sign in with emty password input
    Given I navigate to the application
    When I click on the "<linkName>" link
    And Sign in with empty password input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | link   |
      | signUp |
