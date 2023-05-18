// import java.util.*;
// import java.io.*;
// import java.lang.*;

// public class A1
// {
//     public static void main(String[] args)
//     {
//     Scanner sc =new Scanner(System.in);
// // System.out.println("hello");
//     double x=Math.ceil(2.33333);
//     System.out.println(x);





//     }
// }


import java.util.*;
import java.lang.*;
import java.io.*;

public class A1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    
//     if(n==1)
//     {
//       System.out.println("1");
//         return;
//     }
//     if(arr[0]>=arr[1])
//     {
//       System.out.println("1");
//         return;
//     }
//     else if(arr[n-1]>=arr[n-2])
//     {
//       System.out.println("1");
//         return;
//     }
//     for(int i=1; i<n-1; i++)
//     {
//       if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
//       {
        
//         System.out.println("1");
//         return;
//       }
//     }
    
//      System.out.println("1");
     
    
  
  /*  for(int i=0; i<n-1; i++)
    {
      boolean flag1=true;
      boolean flag2=true;
      for(int j=0; j<i; j++)
      {
        if( arr[i]<=arr[j] )
        {
          flag1=false;
          break;
        }
      }
      
      for(int k=i+1; k<n; k++)
      {
        if(arr[i]>=arr[k])
        {
          flag2=false;
          break;
        }
      }
      
      if(flag1 && flag2 )
      {
         System.out.println("1");
   			 return;

      }
    }
    System.out.println("0"); 
    */
    
    int [] mini=new int[n];
    int []maxi= new int[n];
    
    maxi[0]=arr[0];
    for(int i=1; i<n; i++)
    {
      maxi[i]=Math.max(arr[i], arr[i-1]);
        
    }
  
    mini[n-1]=arr[n-1];
    for(int i=n-2; i>=0; i--)
    {
      mini[i]=Math.min(arr[i], arr[i+1]);
    }

    for(int i=1; i<n-1; i++)
    {
      if(arr[i]>maxi[i-1] && arr[i]<mini[i+1])
      {
        System.out.println("1");
        System.out.println(arr[i] +" el");
        return;
      }
    }
    
    System.out.println("0");
	}
}