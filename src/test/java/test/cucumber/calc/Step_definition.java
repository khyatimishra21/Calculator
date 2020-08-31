
package test.cucumber.calc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Step_definition {
    private Calculator simpleCalculator;
    private ScientificCalculator scientificCalculator;
    private int simpleCalculatorOutput;
    private double scientificCalculatorOutput;

    @Given("I have entered {int} and {int} into the calculator")
    public void I_have_entered_into_the_calculator(int arg0, int arg1) {
        simpleCalculator = new Calculator(arg0, arg1);
    }

    @Given("I have entered {double} into the calculator")
    public void iHaveEnteredInput_IntoTheCalculator(double arg0) { scientificCalculator = new ScientificCalculator(arg0); }

    @Given("I have entered {double} and {double} into the calculator")
    public void iHaveEnteredInput_IntoTheCalculator(double arg0,double arg1) { scientificCalculator = new ScientificCalculator(arg0, arg1); }

    @When("I press add")
    public void I_press_add() {
        simpleCalculatorOutput = simpleCalculator.add();
    }

    @When("I press subtract")
    public void I_press_subtract() {
        simpleCalculatorOutput = simpleCalculator.subtract();
    }

    @When("I press multiply")
    public void I_press_multiply() {
        simpleCalculatorOutput = simpleCalculator.multiply();
    }

    @When("I press divide")
    public void I_press_divide() {
        simpleCalculatorOutput = simpleCalculator.division();
    }

    @When("I press square root")
    public void I_press_square_root() { scientificCalculatorOutput = scientificCalculator.square_root();
    }

    @When("I press exponent")
    public void I_press_exponent() {
        scientificCalculatorOutput = scientificCalculator.exponent();
    }

    @When("I press log10")
    public void I_press_log10() { scientificCalculatorOutput = scientificCalculator.log10();
    }

    @When("I press log")
    public void I_press_log() { scientificCalculatorOutput = scientificCalculator.log();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedRes) {
        assertEquals(expectedRes, simpleCalculatorOutput);
    }

    @Then("the result should be {double} on the screen")
    public void the_result_should_be_on_the_screen1(double expectedRes) {
        assertEquals(expectedRes, scientificCalculatorOutput, 0.001);
    }


}
