@allAppFeatures @loginPageFeatures
Feature: Login page features

  @logInWithCorrectCredential
  Scenario Outline: Log in with correct email and password
    Given I navigate to the application
    When I click the "<linkName>" link
    * I log in with the correct credentials
    Then I check, if I am logged in
    * I click the log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | login    |

  @logInWithIncorrectEmail
  Scenario Outline: Log in with incorect email
    Given I navigate to the application
    When I click the "<linkName>" link
    And Log in with incorrect email
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | login    |

  @logInWithIncorrectEmail
  Scenario Outline: Log in with incorect password
    Given I navigate to the application
    When I click the "<linkName>" link
    And Log in with incorrect password
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName |
      | login    |
