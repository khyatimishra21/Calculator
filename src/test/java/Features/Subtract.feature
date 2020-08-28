Feature: Subtract

  Scenario Outline: Subtract two numbers
    Given I have entered <input_1> and <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples:
      | input_1 | input_2 | button      | output |
      | 3       | 2       | subtract    | 1      |
      | 20      | 5       | subtract    | 15     |
      | 0       | 40      | subtract    | -40    |
