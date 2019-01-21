import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter total number of users : ");
        int total = s1.nextInt();
        
        Employee e1 = new Employee(total);
        e1.display();

    }
}