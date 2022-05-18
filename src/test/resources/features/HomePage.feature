@allAppFeatures @homePageFeatures
Feature: Home Page features

  @checkAllLinks
  Scenario Outline: Check all links
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page

    Examples: 
      | linkName   | pageName       |
      | login      | login          |
      | signUp     | signUp         |
      | buy        | products       |
      | sell       | businessSignUp |
      | cart       | cart           |

  @searchProduct
  Scenario Outline: Find apple product
    Given I navigate to the application
    When I type "<product>" name
    And I choose product
    Then Product description appears on the page

    Examples: 
      | product |
      | jabłko  |

  @searchForProductNoOneHave
  Scenario Outline: Search for a product that no one has
    Given I navigate to the application
    When I type "<productNoOneHas>" name
    And I choose product
    Then There is no product description on the page

    Examples: 
      | productNoOneHas |
      | cebula          |

  @checkCarouselButtons
  Scenario Outline: Check carousel buttons
    Given I navigate to the application
    When I click on the left carousel arrow button
    Then Carousel goes left
    And I click on the right corousel arrow button
    Then Carousel goes right

  @homePageProductAndSellerDetailsCheck
  Scenario Outline: Check seller, product details and cart icon number then Log out
    Given I navigate to the application
    When I click on the "<linkName>" link
    * I log in with the correct credentials
    * I navigate to the home page
    When I type "<product>" name
    * I choose product
    * I click on the product details button
    Then I am sent to the product seller details tab
    * I check if backward button works
    * I click on the product details button
    * I add products to the cart, one of each kind
    Then I check, if cart logo number is updated correctly
    * I click on log out button
    Then I check if I am logged out and there is log in dropdown menu

    Examples: 
      | linkName | product |
      | login    | jabłko  |
