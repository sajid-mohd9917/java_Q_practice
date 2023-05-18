
// bar chart print  


import java.util.Scanner;
public class  barChart17
{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int []arr = new int[n];
	
	for(int i=0; i<n; i++)
	{
	    arr[i]=sc.nextInt();
	}
	   
	   
	   int h=0;
	   for(int i=0; i<n; i++)
	   {
	       if(arr[i]>h)
	       {
	           
	          h=arr[i];
	       }
	   }
	  
	 for(int floor=h; floor>=1; floor--)
	 {
	     for(int i=0; i<n; i++)
	     {
	         if(arr[i]>=floor)
	         {
	             System.out.print("* ");
	         }
	         else
	         {
	             System.out.print("  ");
	         }
	     }
	     System.out.println();
	 }
	
	
	}	
}








