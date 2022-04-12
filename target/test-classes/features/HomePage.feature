@allAppFeatures @homePageFeatures
Feature: Home Page features

  @checkAllLinks
  Scenario Outline: Check all links
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
  Scenario Outline: Find product, apple
    Given User navigates to the application
    When User types "<product>" name
    And Choose product
    Then Product description appears on the page

    Examples: 
      | product |
      | jabłko  |

  @searchForProductNoOneHave
  Scenario Outline: Search for product that no one Have
    Given User navigates to the application
    When User types "<productNoOneHave>" name
    And Choose product
    Then No product description appears on the page

    Examples: 
      | productNoOneHave |
      | cebula           |

  @checkCarouselButtons
  Scenario Outline: Check carousel buttons
    Given User navigates to the application
    When User clicks on left carusel arrow button
    Then Carousel goes left
    And User clicks on right corusel arrow button
    Then Carusel goes right

  @homePageProductAndSellerDetailsCheck
  Scenario Outline: Check seller, product details, Log out and cart icon number on home page
    Given User navigates to the application
    When User clicks on the "<link>"
    And Log in with correct credential
    And Navigate to the home page
    When User types "<product>" name
    And Choose product
    And Clicks on the product details button
    Then User is send to product seller details tab
    And Checks, if backward button works
    And Clicks on the product details button
    And Add products to cart, one of each kind
    Then Checks, if cart logo number is updated correctly
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link  | product |
      | login | jabłko  |
