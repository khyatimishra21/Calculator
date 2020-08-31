Feature: Log10

  Scenario Outline: Log on base 10 of a number
    Given I have entered <input_1> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples:
      | input_1    |  button  | output    |
      | 10.00      | log10    | 1.00      |
      | 100.00     | log10    | 2.00      |
      | 1.00       | log10    | 0.00      |