@SmokeTest @Login
Feature: Login Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button

  Scenario: Login Functionality with valid information

    Given Enter the email and password then click the login button

  Scenario Outline: Login Functionality with invalid information
    Given Enter the invalid email and invalid password then click the login button
    Examples:
      |<email>  |<password>|
      |null     |    valid |
      |invalid  |valid|
      |valid    |null|
      |valid    |invalid|









