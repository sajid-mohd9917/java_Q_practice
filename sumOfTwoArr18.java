    

import java.util.Scanner;
public class sumOfTwoArr18
{
	public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int []arr1= new int[n1];
    for(int i=0; i<n1; i++)
    {
        arr1[i]=sc.nextInt();
    }

//  int n2=sc.nextInt();
//     int []arr2= new int[n2];
//     for(int i=0; i<n2; i++)
//     {
//         arr2[i]=sc.nextInt();
//     }

// int[]sum =new int[n1>n2 ? n1:n2];

// int i=arr1.length-1;
// int j=arr2.length-1;
// int k=sum.length-1;

// int c=0;
// while(k>=0)
// {
//     int d=c;
    
//     if(i>=0)
//     {
//         d=d+arr1[i];
//     }
    
//     if(j>=0)
//     {
//         d=d+arr2[j];
//     }
    
//     c=d/10;
//     d =d%10;
    
//     sum[k]=d;
    
//     i--;
//     j--;
//     k--;
// }

// if(c!=0)
// {
//     System.out.print(c);
// }

// for(int val: sum)
// {
    
//     System.out.print(val);
// }



  //average of array at every stream
  /*
float []arr2 = new float[n1];
float sum =0;
// float count=1;
for(int  i=0; i<arr1.length; i++)
{
    sum =sum +arr1[i];
    
       arr2[i]  = sum/(i+1);   // float avg


    
    
    // arr2[i]=avg;
    
    // count++;
}




for(int  i=0; i<arr2.length; i++)
{
    System.out.print(arr2[i]+" ");
}


	}
}


*/




/*
for(int i=0; i<arr1.length; i++)
{
    for(int j=i+1; j<arr1.length; j++)
    {
        if(arr1[i]>arr1[j])
        {
            int temp =arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;

        }
    }
}

for(int i=0; i<arr1.length; i++)
    {
        System.out.print(arr1[i]+" ");
    }

    }
}
*/



