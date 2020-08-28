package test.cucumber.calc;

import java.util.Scanner;

public class Calculator {
    private int val1;
    private int val2;
    public Calculator(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }
    public int add(){
        return val1 + val2;
    }
    public int subtract(){
        return val1 - (val2);
    }
    public int multiply(){
        return val1 * val2;
    }
    public int division() {
        return val1 / val2;
    }

    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        int output;
        Calculator calc=new Calculator(num1,num2);
        switch(operator)
        {
            case '+':
                output=calc.add();
                System.out.println(num1+" "+operator+" "+num2+": "+output);
                break;
            case '-':
                output=calc.subtract();
                System.out.println(num1+" "+operator+" "+num2+": "+output);
                break;

            case '*':
                output=calc.multiply();
                System.out.println(num1+" "+operator+" "+num2+": "+output);
                break;

            case '/':
                if(num2==0)
                {
                    System.out.println("Division by Zero not possible");
                }
                else
                {
                    output = calc.division();
                    System.out.println(num1+" "+operator+" "+num2+": "+output);
                }
                break;

            default:
                System.out.print("You have entered wrong operator");
        }


    }
}