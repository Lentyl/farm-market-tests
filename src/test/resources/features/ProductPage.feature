@allAppFeatures @productPageFeatures
Feature: Product Page features

  @searchProduct
  Scenario Outline: Find product, apple
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User types "<product>" name
    And Choose product
    Then Product description appears on the page

    Examples: 
      | product | link | name     |
      | jabłko  | buy  | products |

  @searchForProductNoOneHave
  Scenario Outline: Search for product that no one Have
    Given User navigates to the application
    When User clicks on the "<link>"
    Then User is send to "<name>" page
    When User types "<productNoOneHave>" name
    And Choose product
    Then No product description appears on the page

    Examples: 
      | productNoOneHave | link | name     |
      | Bakłażan         | buy  | products |

  @productPageAndSellerDetailsCheck
  Scenario Outline: Check seller, product details, Log out and cart icon number on home page
    Given User navigates to the application
    When User clicks on the "<link>"
    And Log in with correct credential
    When User clicks on the "<byLink>"
    Then User is send to "<name>" page
    When User types "<product>" name
    And Choose product
    Then Clicks on the product details button
    When User is send to product seller details tab
    And Checks, if backward button works
    Then Clicks on the product details button
    And Add products to cart, one of each kind
    Then Checks, if cart logo number is updated correctly
    And Clicks on log out button
    Then Checks if there is sign in and sign up dropdown tab

    Examples: 
      | link  | product   | byLink | name     |
      | login | winogrono | buy    | products |
