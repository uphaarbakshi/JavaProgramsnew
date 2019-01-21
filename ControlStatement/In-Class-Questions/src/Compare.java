import java.util.Scanner;
class Compare
{public static void main(String args[])
{  float n1,n2;
	Scanner s = new Scanner(System.in);
	System.out.println("enter two numbers with 3 decimal spaces");
	n1 = s.nextFloat();
	n2 = s.nextFloat();

	n1= n1*1000;
	n2= n2*1000;
	 if(n1==n2)
	 System.out.println("Values are same");
	 else
	 	System.out.println("Values are not same");
}}