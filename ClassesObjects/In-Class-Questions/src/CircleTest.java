
class Circle
{
	double r;
	double Ar;
	double Cr;

	

 Circle(double r)
 {
 	this.r= r;

 }

public double area()
{
	Ar= 3.14*r*r;
	return Ar;
}

public double circum()
{
	Cr= 2 * 3.14 * r;
    return Cr;
}

void result()
{
	System.out.println("area of circle is" + Ar);
	System.out.println("circumference of circle is" + Cr);

}
}


class CircleTest
{
	public static void main(String args[])
	{
		double a1, c1;
		Circle c = new Circle(10);
		a1= c.area();
		c1= c.circum();
		c.result();

	}
}