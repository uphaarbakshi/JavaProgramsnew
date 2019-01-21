import java.util.Scanner;

public class Employee
{
    Scanner x = new Scanner(System.in);

    int total;
    String[] name = new String[total];
    int[] year = new int[total];
    String[] address = new String[total];

    Employee()
    {
        total = 1;
        name[0] = " Vaibhav ";
        year[0] = 1999;
        address[0] = " A-069 south city- 1, gurgaon ";
    }
    Employee(int total)
    {
        this.total=total;
        String[] name = new String[total];
        int[] year = new int[total];
        String[] address = new String[total];


        for (int i = 0; i<total ; i++)
        {
            System.out.println(" Enter the name of user " + i + " : ");
            name[i]=x.next();
            System.out.println(" Enter the year of joining of user " + i+" : ");
            year[i]=x.nextInt();
            System.out.println(" Enter the address of user "+ i + " : ");
            address[i]= x.next();
        }
    }

    void display()
    {
        System.out.println("Name \t \t Year of Joining \t \t Address");

        for (int i=0; i<total; i++)
        {
            System.out.println(name[i] + " \t \t \t" + year[i] + " \t \t \t \t " + address[i]);
        }
    }


}
