@homePageFeatures
Feature: Home Page features

  @checkAllLinks
  Scenario Outline: CheckAllLinks
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page

    Examples: 
      | link   | name           |
      | login  | login          |
      | signUp | signUp         |
      | buy    | products       |
      | sell   | businessSignUp |
      | cart   | cart           |

  @searchProduct
  Scenario Outline: find product apple
    Given User navigates to the application
    When User type "<product>" name
    And Choose product
    Then Product description appears on the page

    Examples: 
      | product |
      | jabłko  |

  @searchForProductNoOneHave
  Scenario Outline: searchForProductNoOneHave
  	Given User navigates to the application
    When User type "<productNoOneHave>" name
    And Choose product
    Then No product description appears on the page

    Examples: 
      | productNoOneHave |
      | cebula  				 |
