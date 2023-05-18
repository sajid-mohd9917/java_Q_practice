    
import java.util.Scanner;
public class spanOfArray15
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
	    
	    int h=0;
	    for(int i=0; i<n; i++)
	    {
	        if(arr[i]>h)
	        {
	            h=arr[i];
	        }
	    }
	    
	    int low=arr[0];
	    for(int i=0; i<n; i++)
	    {
	        if(arr[i]<low)
	        {
	            low=arr[i];
	        }
	    }
	    
	    
	    int span=h-low;
	    System.out.println("span="+span);
	    
	}
	
	
	
}