    
import java.util.Scanner;
public class printFibSeries5
{
    
    public static void  printFib(int n)
    {
        int a=0;
        int b=1;
        int c;

        System.out.print(a+" "+b+" ");
            
     for(int i=2; i<=n; i++)
     {
         c=a+b;
         System.out.print(c+" ");
        a=b;
        b=c;
        
       
     }
    
    }
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

 printFib(n);
 
 
	}
}




// check the given number is present in Fibonacci
//  sereies or not

/*import java.util.Scanner;
public class Main
{
    
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int g1n = sc.nextInt();

if(g1n==0 || g1n==1)
{
    System.out.println(true);
    return;
}

int a=0,b=1,c;
for(int i=1; i<=g1n; i++)
{
    c=a+b;
    if(c==g1n)
    {
        System.out.println(true);
        return;
    }
    a=b;
    b=c;
    
}

System.out.println(false);




	}
}
 */