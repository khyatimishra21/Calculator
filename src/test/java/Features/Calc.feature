Feature: Calculator
  Scenario: Add two numbers
    Given I have entered 12 and 3 into the calculator
    When I press add
    Then the result should be 15 on the screen
  Scenario: calculate subtract
    Given I have entered 12 and 3 into the calculator
    When I press subtract
    Then the result should be 9 on the screen
  Scenario: calculate multiply
    Given I have entered 12 and 3 into the calculator
    When I press multiply
    Then the result should be 36 on the screen
  Scenario: calculate divide
    Given I have entered 12 and 3 into the calculator
    When I press divide
    Then the result should be 4 on the screen