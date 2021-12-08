@allAppFeatures @LoginPageFeatures
Feature: Login Page features

  @LogInWithCorrectCredential
  Scenario Outline: Log in with correct email and password
    Given User navigates to the application
    When User clicks on the "<link>"
    And Log in with correct credential
    Then Checks, if he is logged in
    And Clicks on log out button
    Then Check if there is sign in and sign up dropdown tab
    
    Examples: 
      | link  |
      | login |
    
  @LogInWithIncorrectEmail
  Scenario Outline: Log in with incorect email
    Given User navigates to the application
    When User clicks on the "<link>"
    And Log in with incorrect email
    Then Check if there is sign in and sign up dropdown tab
    
    Examples: 
      | link  |
      | login |
      

  @LogInWithIncorrectEmail
  Scenario Outline: Log in with incorect password
    Given User navigates to the application
    When User clicks on the "<link>"
    And Log in with incorrect password
    Then Check if there is sign in and sign up dropdown tab
    
    Examples: 
      | link  |
      | login |
