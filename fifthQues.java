package assignment1;

import java.util.Scanner;

class Complex{
    int real;
    int imaginary;
    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex sum(Complex a, Complex b)
    {
        return new Complex((a.real + b.real),(a.imaginary + b.imaginary));
    }

    public static Complex difference(Complex a, Complex b)
    {
        return new Complex((a.real - b.real),(a.imaginary - b.imaginary));
    }

    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real * b.real) - (a.imaginary * b.imaginary)),((a.real * b.imaginary) + (a.imaginary * b.real)));
    }

    public void printComplex()
    {
        if(real == 0 && imaginary != 0)
        {
            System.out.println(imaginary + "i");
        }
        else if(imaginary == 0 && real!=0)
        {
            System.out.println(real);
        }
        else
        {
            System.out.println(real + "+" + imaginary + "i");
        }
    }
}

public class fifthQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 4 numbers: 2 real and 2 imaginary: ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex a = new Complex(r1, i1);
        Complex b = new Complex(r2, i2);
        Complex add = Complex.sum(a, b);
        Complex diff = Complex.difference(a, b);
        Complex prod = Complex.product(a, b);
        System.out.print("Addition of Complex numbers is: ");
        add.printComplex();
        System.out.print("Difference of Complex numbers is: ");
        diff.printComplex();
        System.out.print("Product of Complex numbers is: ");
        prod.printComplex();
    }
}

