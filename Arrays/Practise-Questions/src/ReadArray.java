import java.util.Scanner;
class ReadArray
{
	public static void main(String args[])
	{ int x;
		double sum=0;
    int sum1=0;
    int count,t1,t2;

	Scanner s = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter the elements:");
   for(int i = 0; i < 5; i++)
{
  a[i] = s.nextInt();
  }
  System.out.println("Enter the choice:");
  System.out.println("1st sum;  2nd largest;  3rd smallest;  4th sum of alternate elements; 5th total even nos. ");
  x=s.nextInt();
  switch(x)
  {
  case 1:
  for(int i = 0; i < 5; i++)
   sum = sum + a[i];
System.out.println("sum ="+sum);
break;
case 2:
for (int i = 0; i < 5; i++)
      {for(int j = i + 1; j < 5; j++)
       {
       if(a[i] < a[j])
       {
        t1 = a[i];
        a[i] = a[j];
        a[j] = t1;
       }
        }
        }
        System.out.println("Largest two numbers are:"+a[0]+" and "+a[1]);
      break;
      case 3:
      for(int i = 0; i<5; i++ )
        {
         for(int j = i+1; j<5; j++)
         {
            if(a[i]>a[j])
            {
               t2 = a[i];
               a[i] = a[j];
               a[j] = t2;
            }
         }
      }
      System.out.println("Smallest element of the array is:: "+a[0]);
       break;
       case 4:
       for(int i = 0; i <5;i++)
{  sum1 = sum1 + a[i+2];
}System.out.println("Sum:"+ sum1);
break;

  default:
  System.out.println("system error");

}
	}
}