@allAppFeatures @signinPagefeatures
Feature: Signin page features

  @signInWithCorrectCredential
  Scenario Outline: Sign in with the correct credentials
    Given I navigate to the application
    When I click the "<linkName>" link
    And I sign in with the correct credentials
    Then I check, if I am signed in
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithTheSameCredentials
  Scenario Outline: Sign in with the same correct credentials
    Given I navigate to the application
    When I click the "<linkName>" link
    And Sign in with the same correct credential
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithEmptyNameInput
  Scenario Outline: Sign in with emty name input
    Given I navigate to the application
    When I click the "<linkName>" link
    And Sign in with empty name input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithEmptyEmailInput
  Scenario Outline: Sign in with emty email input
    Given I navigate to the application
    When I click the "<linkName>" link
    And Sign in with empty email input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |

  @signInWithEmptyPassword
  Scenario Outline: Sign in with emty password input
    Given I navigate to the application
    When I click the "<linkName>" link
    And Sign in with empty password input
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | signUp   |
