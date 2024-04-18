Feature: Replacement Order

  @replacement
  Scenario: replacement the order

    Given user on dashboard
    When user click menu button
    And user click on replacement option
    And user on replace receive
    And replace adjustment
    Then successfully replace the products