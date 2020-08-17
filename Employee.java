package com.company;

public class Employee
{
    String name;
    String address;
    int year;
    public Employee(String n, int y, String a)
    {
        name = n;
        year = y;
        address = a;
    }

    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public String getAddress()
    {
        return address;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee("Robert", 1994, "64C- WallStreet");
        Employee e2 = new Employee("Sam", 2000, "68D- WallStreet");
        Employee e3 = new Employee("John", 1999, "28B- WallStreet");
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t\t"+e1.getAddress());
        System.out.println(e2.getName()+"\t\t\t"+e2.getYear()+"\t\t\t\t"+e2.getAddress());
        System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t\t\t"+e3.getAddress());
    }
}
