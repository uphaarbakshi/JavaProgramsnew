import java.util.*;
class Employee
{
    static Scanner x = new Scanner(System.in);

    String fname, lname;
    double msalary,ysalary;

    Employee()
    {
        fname = "Uphaar";
        lname = "Bakshi";
        msalary = 100000;
        ysalary = 12*msalary;
    }

    Employee(String fname, String lname, double msalary)
    {
        this.fname = fname;
        this.lname = lname;

        while (msalary<0)
        {
            System.out.println(" Salary entered is negative. Re-enter salary : ");
            msalary = x.nextInt();
        }
        this.msalary=msalary;
        ysalary = 12*msalary;
    }

    double raiseSalary()
    {
        this.msalary = 1.1*msalary;
        ysalary = 12*msalary;
        return this.msalary;
    }

    void display()
    {
        System.out.println(" Employee's first name is : " + fname);
        System.out.println(" Employee's last name is : "+ lname);
        System.out.println(" Employee's monthly salary is : "+msalary);
        System.out.println(" Employee's yearly salary is : "+ysalary);
    }
}