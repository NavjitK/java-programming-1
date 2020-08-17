package assignment1;

import java.util.Arrays;
import java.util.List;

class Employee
{
    int empId;
    String empName, empDesignation, empLocation;
    long empSalary;
    Employee(int empId, String empName, String empDesignation, long empSalary, String empLocation)
    {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }
    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId()
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName()
    {
        this.empName = empName;
    }

    public String getEmpDesignation()
    {
        return empDesignation;
    }
    public void setEmpDesignation()
    {
        this.empDesignation = empDesignation;
    }

    public long getEmpSalary()
    {
        return empSalary;
    }
    public void setEmpSalary()
    {
        this.empSalary = empSalary;
    }
    public String getEmpLocation()
    {
        return empLocation;
    }
    public void setEmpLocation()
    {
        this.empLocation = empLocation;
    }
}

public class thirdQues
{
    public static void main(String[] args)
    {
        List<Employee> l = Arrays.asList(
                new Employee(1, "Navjit", "Web Developer", 100000, "Bangalore"),
                new Employee(2,"Neeraj", "Digital Head", 80000, "Delhi"),
                new Employee(3, "Nitish", "Analyst", 10000, "Noida"),
                new Employee(4,"Lakhwinder", "Developer", 100000, "Pune"),
                new Employee(5, "Shriya", "Junior Analyst", 45000,"Chennai"),
                new Employee(6,"Prachi", "Software Intern", 35000,"Gurgaon"),
                new Employee(7,"Anshika", "Head of Marketing", 10000, "Mohali"),
                new Employee(8,"Piyush", "HR Manager", 50000, "Chandigarh"),
                new Employee(9,"Arvinder", "Software Developer", 40000, "Amritsar"),
                new Employee(10,"Navi", "Manager", 100000, "Bangalore")
        );
        System.out.println("Name of all the Employees: ");
        l.stream().forEach(p -> System.out.println(p.getEmpName()));

        System.out.println("______________________________");
        System.out.println("Salaries greater than 50,000");

        l.stream().filter(p -> p.getEmpSalary()>50000).forEach(p -> System.out.println(p.getEmpSalary()));

        System.out.println("_______________________________");
        System.out.println("Locations starting with 'M'");

        l.stream().filter(p -> p.getEmpLocation().startsWith("M")).forEach(p -> System.out.println(p.getEmpLocation()));

        System.out.println("_______________________________");
        System.out.println("Designations ending with 'E'");

        l.stream().filter(p -> p.getEmpDesignation().endsWith("e")).forEach(p -> System.out.println(p.getEmpDesignation()));
    }
}

