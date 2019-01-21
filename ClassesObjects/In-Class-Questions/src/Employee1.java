import java.util.Scanner;

 class EmployeeTest
{
    static Scanner x = new Scanner(System.in);

    public static void main(String args[])
    {
            String fname, lname, fname1, lname1;
            double msalary, msalary1;
            System.out.println(" Enter first name of employee 1 : ");
            fname = x.next();
            System.out.println(" Enter last name of employee 1 : ");
            lname = x.next();
            System.out.println(" Enter monthly salary of employee 1 : ");
            msalary = x.nextInt();

            Employee e1 = new Employee(fname,lname,msalary);

            e1.raiseSalary();
            e1.display();

            System.out.println(" ");

            System.out.println(" Enter first name of employee 2 : ");
            fname1 = x.next();
            System.out.println(" Enter last name of employee 2 : ");
            lname1 = x.next();
            System.out.println(" Enter monthly salary of employee 2 : ");
            msalary1 = x.nextInt();
            Employee e2 = new Employee(fname1,lname1,msalary1);
            e2.raiseSalary();
            e2.display();
    }
}