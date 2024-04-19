@SmokeTest @Regression @Address
Feature: Add Address Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario Outline: Address Insertion Functions
    Given Click on the my Account
    And Click on the Address Book
    Then Add new Address as "<firstName>" as "<lastName>" as "<company>" as "<telephone>" as "<street_1>" as "<street_2>" as "<street_3>" as "<city>" as "<zip>"
    And The user should receive the message that the address has been successfully added
    Examples:
      | firstName | lastName | company        | telephone | street_1 | street_2      | street_3     | city     | zip   |
      | john      | wick     | brothers shoes | 5555555   | Uskudar  | yavuzturk mah | tarih cad    | istanbul | 34000 |
      | harry     | wick     | brothers shoes | 4444444   | Kadikoy  | osmanaga mah  | boga cad     | istanbul | 34001 |
      | mary      | wick     | brothers shoes | 3333333   | Atasehir | mevlana mah   | Halisaha cad | istanbul | 34002 |

