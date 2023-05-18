    // rotate an array one d array

import java.util.*;
public class rev1D_Arr22
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    // int q=sc.nextInt();
    
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    int []rotarr=new int[n];
    for(int i=0;i<n;i++)
    {
      int newind=(i+k)%n;
      rotarr[newind]=arr[i];   //rotarr[(i+k)%n]=arr[i];
    }
    
    // for(int i=0;i<q;i++)
    // {
    //   int qi = sc.nextInt();
    //   System.out.println(rotarr[qi]);
    // }



    for(int i=0;i<n;i++)
    {
      System.out.print(rotarr[i]+" ");
    }

	}
}