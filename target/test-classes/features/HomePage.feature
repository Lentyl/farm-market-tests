@homePageFeatures
Feature: Home Page features

  @searchProducts
  Scenario Outline: find product apple
    Given User navigates to the application
    When User type "<product>" name
    And Choose product
    Then Product description appears on the page

    Examples: 
    | product |
    | jab |