
package test.cucumber.calc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Step_definition {
    private Calculator calc;
    private int output;
    @Given("I have entered {int} and {int} into the calculator")
    public void I_have_entered_into_the_calculator(int arg0, int arg1) {
        calc = new Calculator(arg0, arg1);
    }

    @When("I press add")
    public void I_press_add() {
        output = calc.add();
    }

    @When("I press subtract")
    public void I_press_subtract() {
        output = calc.subtract();
    }

    @When("I press multiply")
    public void I_press_multiply() {
        output = calc.multiply();
    }

    @When("I press divide")
    public void I_press_divide() {
        output = calc.division();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedRes) {
        assertEquals(expectedRes, output);
    }

}
