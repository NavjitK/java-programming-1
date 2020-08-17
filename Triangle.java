package assignment1;

import java.util.Scanner;

class Triangle
{
    static float Area(float a, float b, float c)
    {
        float s = (a+b+c)/2;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side: ");
        float a = sc.nextFloat();
        System.out.println("Enter Second Side: ");
        float b = sc.nextFloat();
        System.out.println("Enter Third Side: ");
        float c = sc.nextFloat();
        System.out.println("Area is " + Area(a, b, c));
    }
}

