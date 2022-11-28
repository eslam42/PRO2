@smoke
  Feature: F05_hoverCategories | select random category from three hovarable categories
    Scenario: hover over categories
      When user hover category and select subcategory then check if the name = to page title
      And user go to the subcategory page
      Then user check if page title = subcategory name
