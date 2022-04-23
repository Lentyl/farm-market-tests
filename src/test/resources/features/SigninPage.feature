@allAppFeatures @signinPagefeatures
Feature: Signin Page features

  @signInWithCorrectCredential
  Scenario Outline: Sign in with corect credential
    Given User navigates to the application
    When User clicks on the "<link>"
    And Sign in with correct credential
    Then Checks, if he is signed in
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab
    
    Examples: 
      | link   |
      | signUp |
      
  @signInWithTheSameCredentials
  Scenario Outline: Sign in with the same credentials
    Given User navigates to the application
    When User clicks on the "<link>"
    And Sign in with the same correct credential
    Then Checks if there is sign in and sign up dropdown tab
    
    Examples: 
      | link   |
      | signUp |
      
  
  @signInWithEmptyNameInput
  Scenario Outline: Sign in with emty name input
    Given User navigates to the application
    When User clicks on the "<link>"
    And Sign in with empty name input
    Then Checks if there is sign in and sign up dropdown tab
    
    Examples: 
      | link   |
      | signUp |
    
  @signInWithEmptyEmailInput
  Scenario Outline: Sign in with emty email input
    Given User navigates to the application
    When User clicks on the "<link>"
    And Sign in with empty email input
    Then Checks if there is sign in and sign up dropdown tab
    
    Examples: 
      | link   |
      | signUp |
      

  @signInWithEmptyPassword
  Scenario Outline: Sign in with emty password input
    Given User navigates to the application
    When User clicks on the "<link>"
    And Sign in with empty password input
    Then Checks if there is sign in and sign up dropdown tab
    
    Examples: 
      | link   |
      | signUp |
     
