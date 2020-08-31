Feature: Exponent

  Scenario Outline: A number is raised to the given power
    Given I have entered <input_1> and <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples:
      | input_1    | input_2    | button     | output    |
      | 20.00      | 3.00       | exponent   | 8000.00   |
      | 2.00       | 5.00       | exponent   | 32.00     |
      | 0.00       | 40.00      | exponent   | 0.00      |
