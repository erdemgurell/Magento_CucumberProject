Feature: TAB Menu Functionality

  Background:
    Given Navigate to Magento website

  Scenario: Access the Main Categories From the TAB Menu

    When Hover Over the Main and Sub Categories in the TAB Menu
      | women          |
      | womenTops      |
      | jacketsWm      |
      | hoodiesWm      |
      | teesWm         |
      | brasAndTanksWm |
      | womenBottoms   |
      | pantsWm        |
      | shortsWm       |
      | men            |
      | menTops        |
      | jacketsMn      |
      | hoodiesMn      |
      | teesMn         |
      | tanksMn        |
      | menBottoms     |
      | pantsMn        |
      | shortsMn       |
      | gear           |
      | bagsGr         |
      | fitnessGr      |
      | watchesGr      |
      | training       |
      | trainingSubCat |

    And Click the Main categories in the TAB Menu
      | whatsNew |
      | sale     |
    Then User Should Be Able To See the All Categories

