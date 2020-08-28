package test.cucumber.calc;

import java.util.Scanner;

public class Calculator {
    private int value1;
    private int value2;
    public Calculator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add(){
        return value1 + value2;
    }

    public int subtract(){
        return value1 - (value2);
    }

    public int multiply(){
        return value1 * value2;
    }

    public int division() {
        return value1 / value2;
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        number1 = scanner.nextInt();
        System.out.print("Enter second number:");
        number2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        int output;
        Calculator calc=new Calculator(number1,number2);
        switch(operator)
        {
            case '+':
                output=calc.add();
                System.out.println(number1+" "+operator+" "+number2+": "+output);
                break;
            case '-':
                output=calc.subtract();
                System.out.println(number1+" "+operator+" "+number2+": "+output);
                break;

            case '*':
                output=calc.multiply();
                System.out.println(number1+" "+operator+" "+number2+": "+output);
                break;

            case '/':
                if(number2==0)
                {
                    System.out.println("Division by Zero not possible");
                }
                else
                {
                    output = calc.division();
                    System.out.println(number1+" "+operator+" "+number2+": "+output);
                }
                break;

            default:
                System.out.print("You have entered wrong operator");
        }


    }
}