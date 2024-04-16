Feature: Search Functionality

  Background:
    Given Navigate to Magento website

  Scenario: Search Product by Product Code
    Given Hoverover on the Element
      | tableMen    |
      | subMenuTops |

    And Click on the Element
      | subMenuJackets |
    And Select Product and Search by Code
    Then The user must be able to see the product
    And Incorrect Product Code "MJ154611"