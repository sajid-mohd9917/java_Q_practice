    
import java.util.Scanner;
public class findElementArr16 
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int []arr = new int[n];
	
	for(int i=0; i<n; i++)
	{
	    arr[i]=sc.nextInt();
	}
	   
	   int val =sc.nextInt();
	 
	   for(int i=0; i<n; i++)
	   {
		if(arr[i]==val)
		{
		
			System.out.println("element found at ind ="+i);
			return;
		}
	   }
	
	   System.out.println("element not found!");
	}	
}