Feature: Log

  Scenario Outline: Log on base e of a number
    Given I have entered <input_1> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples:
      | input_1    |  button  | output      |
      | 10.00      | log      | 2.302585    |
      | 2.00       | log      | 0.693147    |
      | 1.00       | log      | 0.000000    |