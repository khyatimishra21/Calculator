
package test.cucumber.calc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Step_definition {
    private Calculator calc;
    private ScientificCalculator calc1;
    private int output;
    private double output1;

    @Given("I have entered {int} and {int} into the calculator")
    public void I_have_entered_into_the_calculator(int arg0, int arg1) {
        calc = new Calculator(arg0, arg1);
    }

    @Given("I have entered {double} into the calculator")
    public void iHaveEnteredInput_IntoTheCalculator(double arg0) { calc1 = new ScientificCalculator(arg0); }

    @Given("I have entered {double} and {double} into the calculator")
    public void iHaveEnteredInput_IntoTheCalculator(double arg0,double arg1) { calc1 = new ScientificCalculator(arg0, arg1); }

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

    @When("I press square root")
    public void I_press_square_root() { output1 = calc1.square_root();
    }

    @When("I press exponent")
    public void I_press_exponent() {
        output1 = calc1.exponent();
    }

    @When("I press log10")
    public void I_press_log10() { output1 = calc1.log10();
    }

    @When("I press log")
    public void I_press_log() { output1 = calc1.log();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedRes) {
        assertEquals(expectedRes, output);
    }

    @Then("the result should be {double} on the screen")
    public void the_result_should_be_on_the_screen1(double expectedRes) {
        assertEquals(expectedRes, output1, 0.001);
    }


}
