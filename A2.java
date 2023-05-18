// import java.util.Scanner;

// public class A2
// {

//     public static long convertBinary(long n)
//     {
//         long sum =0;
//         long p=1;
//         while(n>0)
//         {
//             long rem =n%2;
//             n=n/2;
//             sum =sum +rem*p;
//             p=p*10;
//         }
//         return sum;
//     }
//     public static void main(String[] args)
//     {
//     Scanner sc =new Scanner(System.in);
//    long a=12;
//    long b=17;


 
//     long a1= convertBinary(a);
//     long b1= convertBinary(b);
    
//     String a2=""+a1;
//     String b2=""+b1;

     
//     long count=0;
//     for(int i=0; i<b2.length(); i++)
//     {
//         char ch1=a2.charAt(i);
//         char ch2=b2.charAt(i);
//         if(ch1 == ch2)
//         {
//             count++;
//         }
//     }
// System.out.println(count);
//     System.out.println(a1+" ," + b1);
//     System.out.println(a2.charAt(1) + " ,"+ b2.charAt(0));
//     }
// }




/*import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    String inp=sc.next();
    
    char []encA={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char []decA={'0','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25'};
    
    String str="";
    for(int i=0; i<inp.length(); i++)
    {
      for(int j=0; j<26; j++)
      {
        if(inp.charAt(i)==encA[j])
        {
          str=str+decA[j];
          break;
        }
      }
    }
    
    System.out.println( str );
    
    
	}
} */






/*import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		// your code here
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int []arr=new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    
    
    if(n==1)
    {
//       System.out.println(arr[0]);
      System.out.println("1");
      return;
    }
    if(arr[n-1]>=arr[n-2])
    {
//       System.out.println(arr[n-1]);
       System.out.println("1");
      return;
    }
    
    for(int i=1; i<n-1; i++)
    {
      if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
      {
//        System.out.println(arr[i]);
         System.out.println("1");
      return;
      }
    }
      
      System.out.println("0");

	}
} */