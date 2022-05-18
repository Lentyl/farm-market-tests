@allAppFeatures @productPageFeatures
Feature: Product Page features

  @searchProduct
  Scenario Outline: Find product, apple
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I type "<product>" name
    * I choose product
    Then Product description appears on the page

    Examples: 
      | product | linkName | pageName |
      | jabłko  | buy      | products |

  @searchForProductNoOneHas
  Scenario Outline: Search for product that no one Have
    Given I navigate to the application
    When I click on the "<linkName>" link
    Then I am sent to the "<pageName>" page
    When I type "<productNoOneHas>" name
    * I choose product
    Then There is no product description on the page

    Examples: 
      | productNoOneHave | linkName | pageName |
      | Bakłażan         | buy      | products |

  @productPageAndSellerDetailsCheck
  Scenario Outline: Check seller, product details, Log out and cart icon number on home page
    Given I navigate to the application
    When I click on the "<linkName>" link
    * I log in with the correct credentials
    When I click on the "<byLink>" link
    Then I am sent to the "<pageName>" page
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
      | linkName | product   | byLink | pageName |
      | login    | winogrono | buy    | products |
