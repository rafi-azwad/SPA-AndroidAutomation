Feature: Synchronise

  @synchronise
  Scenario: synchronise all the feature
    Given user on SPA's dashboard
    When synchronise the products
    And synchronise the retailers
    And synchronise the priority
    And synchronise the stock
    And synchronise the trade
    And synchronise the replace cause
    And synchronise the product mrp
    And synchronise the daily target
    Then successfully synchronise all data


