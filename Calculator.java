package assignment1;

import java.util.Scanner;

@FunctionalInterface
interface Add
{
    public double add(double a, double b);
}
interface Difference
{
    public double difference(double a, double b);
}
interface Product
{
    public double product(double a, double b);
}
interface SafeDivision
{
    public double safeDivision(double a, double b);
}

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Enter the digits between 1-4 to do basic calculations");
        System.out.println("1. Enter 1 for Addition");
        System.out.println("2. Enter 2 for Difference");
        System.out.println("3. Enter 3 for Multiplication");
        System.out.println("4. Enter 4 for Safe Division");
        System.out.println("----------------------------------------");
        System.out.print("Enter the value for your desired operation: ");
        int num = sc.nextInt();
        assignment1.Add addition = (double a, double b) ->
        {
            return a + b;
        };
        assignment1.Difference diff = (double a, double b) ->
        {
            return a - b;
        };
        assignment1.Product prod = (double a, double b) ->
        {
            return a * b;
        };
        assignment1.SafeDivision safediv = (double a, double b) ->
        {
            if(b == 0)
            {
                return 0;
            }
            return a/b;
        };
        switch (num)
        {
            case 1:
            {
                System.out.print("Enter the first value: ");
                double a = sc.nextDouble();
                System.out.print("Enter the second value: ");
                double b = sc.nextDouble();
                System.out.println("Addition: " + addition.add(a, b));
                break;
            }
            case 2:
            {
                System.out.print("Enter the first value: ");
                double a = sc.nextDouble();
                System.out.print("Enter the second value: ");
                double b = sc.nextDouble();
                System.out.println("Difference: " + diff.difference(a, b));
                break;
            }
            case 3:
            {
                System.out.print("Enter the first value: ");
                double a = sc.nextDouble();
                System.out.print("Enter the second value: ");
                double b = sc.nextDouble();
                System.out.println("Product: " + prod.product(a, b));
                break;
            }
            case 4:
            {
                System.out.print("Enter the first value: ");
                double a = sc.nextDouble();
                System.out.print("Enter the second value: ");
                double b = sc.nextDouble();
                System.out.println("Safe Division: " + safediv.safeDivision(a, b));
                break;
            }
            default:
            {
                System.out.println("Invalid Entry, Please Try again!!");
                break;
            }
        }
        sc.close();
    }
}


