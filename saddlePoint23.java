   
//saddle point in array  

import java.util.Scanner;
public class saddlePoint23
{
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
	    
	    int [][]arr= new int[n][n];
	    for(int i=0; i<arr.length; i++)
	    {
	        for(int j=0; j<arr[0].length; j++)
	        {
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        int minc=0;
	        for(int j=0; j<arr[0].length; j++)
	        {
	            if(arr[i][j]< arr[i][minc])
	            minc=j;
	        }
	        
	        int ct=0;
	        for(int k=0; k<arr.length; k++)
	        {
	            if(arr[k][minc]> arr[i][minc])
	            {
	                ct=1;
	                break;
	            }
	        }
	        
	        
	        if(ct==0)
	        {
	              System.out.println("saddle point index : " + "[" + i  + "," + minc +"]");
	           	  System.out.println("saddle point element: "+ arr[i][minc]);
	              return;
	        }
	        
	        
	    }
	    
	    
	    
	    System.out.println("not found!");
	    
	    
	    
	}
}
