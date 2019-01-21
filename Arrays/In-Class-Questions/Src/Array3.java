class Array3 {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int ar[] = new int[5];

        int count = 0; 
        int x = 0;
        int num = 0;

        while (x < ar.length) 
            {
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100))
             {
                boolean digit = false;
                x++;

                for (int i = 0; i < sid.length; i++) 
                 {   if (ar[i] == num)     
                     digit = true;
                 }  

            if (!digit)
             {

                    ar[count] = num;

                    count++;

             }

               else

                System.out.printf("the number was entered before \n");

               }     

              else
               System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) 
                System.out.print(sid[i] +" ");

            

            System.out.println();  
        } 

        } 
    } 
    