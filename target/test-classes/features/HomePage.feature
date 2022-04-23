@allAppFeatures @homePageFeatures
Feature: Home Page features

  @checkAllLinks
  Scenario Outline: Check all links
    Given I navigate to the application
    When I click on the "<link>" link
    Then I am send to "<name>" page

    Examples: 
      | link   | name           |
      | login  | login          |
      | signUp | signUp         |
      | buy    | products       |
      | sell   | businessSignUp |
      | cart   | cart           |

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
  Scenario Outline: Search for product that no one have
    Given I navigate to the application
    When I type "<productNoOneHave>" name
    And I choose product
    Then No product description appears on the page

    Examples: 
      | productNoOneHave |
      | cebula           |

  @checkCarouselButtons
  Scenario Outline: Check carousel buttons
    Given I navigate to the application
    When I click on the left carusel arrow button
    Then Carousel goes left
    And I click on the right corusel arrow button
    Then Carusel goes right

  @homePageProductAndSellerDetailsCheck
  Scenario Outline: Check seller, product details and cart icon number then Log out
    Given I navigate to the application
    When I click on the "<link>" link
    * I log in with correct credential
    * I navigate to the home page
    When I type "<product>" name
    * I choose product
    * I click on the product details button
    Then I am send to product seller details tab
    * I check, if backward button works
    * I click on the product details button
    * I add products to cart, one of each kind
    Then I check, if cart logo number is updated correctly
    * I click on the log out button
    Then I check, if there is sign in and sign up dropdown tab

    Examples: 
      | link  | product |
      | login | jabłko  |
