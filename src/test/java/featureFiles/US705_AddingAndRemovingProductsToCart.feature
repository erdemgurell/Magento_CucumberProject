Feature:Adding and removing items functionality

  Background:
    Given Navigate to Magento website

  Scenario: Adding and removing items from the shopping cart
    Given Hoverover on the Element
      | tableMen    |
      | subMenuTops |

    And Click on the Element
      | subMenuJackets |
    And Select Product Size, Color and Add to Cart
    And Control of Product Price and Total Price
    And Emptying the Products From the Order box
    Then The user should see There are no items in your shopping cart.

