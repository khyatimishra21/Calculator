package test.cucumber.calc;

import java.util.Scanner;

public class ScientificCalculator {
    private double value1;
    private double value2;
    public ScientificCalculator(double value1){
        this.value1 = value1;
        this.value2 = 0.0;
    }

    public ScientificCalculator(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double square_root(){
        return Math.sqrt(value1);
    }

    public double exponent(){
        return Math.pow(value1, value2);
    }

    public double log10(){
        return Math.log10(value1);
    }

    public double log(){
        return Math.log(value1);
    }

    public static void main(String[] args) {
        double number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        number1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        number2 = scanner.nextDouble();

        System.out.print("Enter an operator (square root, exponent, log10, log): ");
        String operator = scanner.nextLine();
        scanner.close();
        double output;
        ScientificCalculator calc=new ScientificCalculator(number1);

        switch (operator) {
            case "square root":
                output = calc.square_root();
                System.out.println("Square root of " + number1 + " is: " + output);
                break;
            case "exponent":
                ScientificCalculator calc1=new ScientificCalculator(number1,number2);
                //New object for passing two arguments
                output = calc1.exponent();
                System.out.println(number1 + "raise to the power" + number2 + " : " + output);
                break;
            case "log10":
                output = calc.log10();
                System.out.println("The log10 of " + number1 + " is: " + output);
                break;
            case "log":
                output = calc.log();
                System.out.println("The log(base e) of " + number1 + " is: " + output);
                break;
            default:
                System.out.println("Wrong operator");
                break;
        }




    }
}