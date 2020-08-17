package assignment1;

import java.util.*;
import java.lang.*;

class genException extends Exception
{
    genException(String str)
    {
        super(str);
    }
}
public class Generic
{
    static <T>void genericException()throws genException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int val = ((2 * n) / 3);
        System.out.print("2/3rd of " + n + " is: " + val);
    }
    public static void main(String args[])
    {
        try{
            genericException();
            System.out.println("");
        }
        catch(Exception e)
        {
            System.out.println("Please enter numbers only...");
        }
    }
}