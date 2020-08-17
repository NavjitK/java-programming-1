package assignment1;

import java.util.Scanner;

class Rectangle
{
    int width, height;
    void display()
    {
        System.out.println("Width: " + width + " & Height: " + height);
    }
}

class RectangleArea extends Rectangle
{
    void read_input(int w, int h)
    {
        this.width = w;
        this.height = h;
    }
    void display()
    {
        super.display();
        System.out.println("Area: "+this.width * this.height);
    }
}

public class secondQues
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RectangleArea ra = new RectangleArea();
        System.out.print("Enter the width of Rectangle: ");
        int w = sc.nextInt();
        System.out.print("Enter the height of Rectangle: ");
        int h = sc.nextInt();
        ra.read_input(w, h);
        ra.display();
        sc.close();
    }
}

