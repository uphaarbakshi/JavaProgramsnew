
import java.util.Scanner;
class ArrayQues2
{
	public static void main(String args[])
	{ int sum =0;
		int a[] = new int[5];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the elements in array: ");
    for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
sum = sum + a[i];
	} System.out.println("Sum = "+sum);
	int min = a[0]; 
		int max = a[0]; 
        int max2 = a[0];
        int evenCount = 0;
		for (int i = 1; i < a.length; i++)  
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
           			if (a[i] > max)
           			 {
				      max2 = max;
				      max = a[i];
			         } 
			         else if (a[i] > max2)
			         {
				      max2 = a[i];
                     }
                     for(i = 0; i < 5; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i] +" ");
				evenCount++;
			}
		}		
                 }
        System.out.println("Largest Number in the given array is : " + max);
		System.out.println("Smallest Number in the given array is : " + min);
	    System.out.println("Second largest number in the given array is:" + max2);
        System.out.println("Total Number of Even Numbers in this Array = " + evenCount);
}
}