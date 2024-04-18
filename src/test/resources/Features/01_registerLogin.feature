Feature: Registration And Login

  @register
  Scenario Outline: registration with valid data

    Given user on SPA's registration page
    When user click on register button
    And fill the required information '<userid>' '<password>' and '<mobileNumber>'
    And user click on register button
    Then successfully created user registration

    Examples:
      | userid   | password | mobileNumber |
      | 99999998 | 1234     | 01456222222  |

  @login
  Scenario Outline: user login with valid data
    Given user on SPA's login page
    When user enter valid '<userid>' and '<password>'
    And click login button
    Then successfully open home page

    Examples:
      | userid   | password |
      | 99999998 | 1234     |