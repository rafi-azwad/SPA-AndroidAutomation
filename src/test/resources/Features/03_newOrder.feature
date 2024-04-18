Feature:New Order

  @newOrder
  Scenario: add new order
    Given user on SPA's dashboard
    When user click on menu button
    And click on new order
    And select retailer's name
    And fill the required information
    Then successfully created new order
