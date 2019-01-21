import java.util.Scanner; 
public class Index { 
   
    public static int findIndex(int arr[], int t) 
    { 
        
       if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
           while (i < len) { 
  
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
      public static void main(String[] args) 
    { 
        int[] my_array = new int[10]; 
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the elements ");
        for(int i=0;i<10;i++)
        {

        my_array[i] = input.nextInt();    } 

      System.out.println("enter the number whose index needs to be found");
        int x = input.nextInt();
      System.out.println("the number is"+ x);

      System.out.println("index position of x is:"
                           + findIndex(my_array, x));
    
      } 
} 