Feature: Square root

  Scenario Outline: Square root of a number
    Given I have entered <input_1> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples:
      | input_1    | button         | output    |
      | 400.00     | square root    | 20.00     |
      | 25.00      | square root    | 5.00      |
      | 0.00       | square root    | 0.00      |