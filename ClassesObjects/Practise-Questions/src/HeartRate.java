import java.util.Scanner;
class Heart
{
	String FirstName()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your First name here: ");
    String FirstName = input.nextLine();
	return FirstName;
	}
	String LastName()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your Last name here: ");
    String LastName = input.nextLine();
	return LastName;
	}
	double Date()
	{
	Scanner input = new Scanner(System.in);
System.out.println("Please enter your Date of birth here as Date: ");
double Date = input.nextDouble();
return Date;
}
double Month()
{
	Scanner input = new Scanner(System.in);
	System.out.println("Month: ");
	double Month = input.nextDouble();
	return Month;
}
public double Year()
{
	Scanner input = new Scanner(System.in);
	System.out.println("Year:");
	double Year = input.nextDouble();
	return Year;
}
public double Age()
{
	double Age;
	Age = 2019 - Year();
	System.out.println("Age - "+Age);
    return Age;
}
public double rate()
{   double rate;
	rate = 220 - Age();
    System.out.println("Max. Heart Rate - " +rate);
	return rate;
}

	public void display(String FirstName, String LastName, double Date, double Month, double Year, double Age, double rate)
	{
	System.out.print("First Name");
	System.out.print(" ");
	System.out.print("Last Name");
	System.out.print(" ");
    System.out.print("Date of Birth");
    System.out.print(" ");
	System.out.print("Age");
	System.out.print(" ");
	System.out.println(" Max. Heart Rate   ");
	System.out.print(FirstName);
	System.out.print("    ");
	System.out.print(LastName);
	System.out.print("    ");
	System.out.print(Date);
	System.out.print("/");
	System.out.print(Month);
	System.out.print("/");
	System.out.print(Year);
	System.out.print("    ");
	System.out.print(Age);
	System.out.print("    ");
	System.out.print(rate);
	}
}
class HeartRate
{
	public static void main(String args[])
	{
	Heart o = new Heart();
	o.display(o.FirstName(),o.LastName(),o.Date(),o.Month(),o.Year(),o.Age(),o.rate());
	}
}