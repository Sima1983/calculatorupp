package Projectcalculator;

import java.util.Scanner;

public class Calculator {
    public stati2c void main(String[] args){
        Scanner input = new Scanner (System.in);
        double Val1;
        double Val2;
        double Result;
        System.out.println("Enter First Value: ");
        Val1 = input.nextDouble();
        System.out.println("Enter Second Value: ");
        Val2 = input.nextDouble();
        System.out.println("Enter an Operator (+, -, *, /): ");
       char operator = input.next().charAt(0);
        switch(operator)
        {
            case '+':
                Result= addition(Val1,Val2);
                System.out.println(Result);
                break;

            case '-':
                Result= subtraction(Val1,Val2);
                System.out.println(Result);
                break;

            case '*':
                Result= multiplication(Val1,Val2);
                System.out.println(Result);
                break;

            case '/':
                Result= division(Val1,Val2);
                System.out.println(Result);
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;

        }
    }

    public static double addition(double x, double y)
    {
        return x + y;
    }
    public static double subtraction(double x, double y)
    {
        return x - y;
    }
    public static double multiplication(double x, double y)
    {
        return x * y;
    }
    public static double division(double x, double y)
    {
        double Result = x / y;
        return Result;
    }

}
