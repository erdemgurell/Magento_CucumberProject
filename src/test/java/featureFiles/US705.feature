Feature:Adding and removing items funcionality

  Background:
    Given Navigate to Magento website

  Scenario: Adding and removing items from the shopping cart
    Given Hoverover on the Element
    |tableMen|
    |subMenuTops|

    And Click on the Element
    |subMenuJackets|
    And Select Product Size, Color and Add to Cart
