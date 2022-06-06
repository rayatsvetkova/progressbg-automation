Feature: Login and Shop
  In order to improve my experience
  As a user
  I want to have login form and to be able to shop items

  Scenario Outline: User is successfully logged in
    Given there are a valid username "<username>" and password "<password>"
    When the user fills the login form with appropriate data
    Then the user is successfully logged in

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Negative login
    Given there are invalid username "<username>" or password "<password>"
    When the user tries to login
    Then the user gets an expected error message "<message>"

    Examples:
      | username        | password     | message                                                                   |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | standard_user   | password     | Epic sadface: Username and password do not match any user in this service |

  Scenario Outline: User buys items one by one
    Given the user is logged in with username "<username>" and password "<password>"
    When the user adds item by navigating to the item page and get the price
      | Item1   | Item2   | Item3   |
      | <item1> | <item2> | <item3> |
    Then the items are added to the cart and the price is updated correctly

    Examples:
      | item1               | item2                    | item3                             | username      | password     |
      | Sauce Labs Backpack | Sauce Labs Fleece Jacket | Test.allTheThings() T-Shirt (Red) | standard_user | secret_sauce |

  Scenario Outline: User buys items from the product container
    Given the user is logged in with username "<username>" and password "<password>"
    When the user adds the following item to the cart from the container
      | Item1   | Item2   | Item3   |
      | <item1> | <item2> | <item3> |
    Then the items are added to the cart and the price is updated correctly

    Examples:
      | item1               | item2                    | item3                             | username      | password     |
      | Sauce Labs Backpack | Sauce Labs Fleece Jacket | Test.allTheThings() T-Shirt (Red) | standard_user | secret_sauce |


  Scenario Outline: Filtering the products
    Given the user is logged in with username "<username>" and password "<password>"
    When the user click on the sorting container and selects option value "<value>", the items are sorted
    Then the products are sorted correctly
      | Value   |
      | <value> |

    Examples:
      | value               | username      | password     |
      | Name (Z to A)       | standard_user | secret_sauce |
#      | Price (high to low) | standard_user | secret_sauce |


