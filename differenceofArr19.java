    //Not Complete Yet

import java.util.Scanner;
public class  differenceofArr19
{
	public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   int n1=sc.nextInt();
   int []arr1=new int[n1];
for(int i=0; i<n1; i++)
{
    arr1[i]=sc.nextInt();
    
}

int n2=sc.nextInt();
int []arr2=new int[n2];
for(int i=0; i<n2; i++)
{
    arr2[i]=sc.nextInt();
}

int []diff=new int[n2];

int i=arr1.length-1;
int j=arr2.length-1;
int k=diff.length-1;

    int c=0;
while(k>=0)
{
    int d=0;
    int n1v = i>=0? arr1[i]:0;
    
    if(arr2[j]+c >= n1v)
    {
        c=0;
        d=arr2[j]-n1v;
        
    }
    else
    {
        c=-1;
        d=arr2[j]+10-n1v;
    }
    
    diff[k]=d;
    
    i--;
    j--;
    k--;
    
    
}




	}
}
