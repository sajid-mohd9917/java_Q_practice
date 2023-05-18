/*
import java.util.Scanner;
public class digitFrequency3
{
    
    
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int d = sc.nextInt();
    
     int count=0;
     while(n>0)
     {
         long rem = n%10;
         if(rem == d)
         {
             count++;
         }
         
         n = n/10;
     }
     
     System.out.println(count);
     
     
	}
}

*/




import java.util.Scanner;
public class digitFrequency3
{
    
    public static boolean checkVal(int [][]arr, int val)
    {
            for(int i=0; i<arr.length; i++)
            {
                for(int j=0; j<arr[0].length; j++)
                {
                    if(arr[i][j]==val)
                    {
                        return true;
                    }
                }
            }
            return false;
    }
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  int [][]arr= new int[n][n];
  
   
   
   for(int i=0; i<n; i++)
   {
       for(int j=0; j<n; j++)
       {
           arr[i][j]=sc.nextInt();
       }
        System.out.println();
   }
   
//    for(int i=0; i<n; i++)
//    {

//        for(int j=0; j<n; j++)
//        {
//         if(arr[i][j]==3)
//         {
//             System.out.println("true");
//             return;
//         }
//        }
//         System.out.println();
//    }
    

//    System.out.println("false");


boolean ans = checkVal(arr,30);
System.out.println(ans);

     
	}
}
