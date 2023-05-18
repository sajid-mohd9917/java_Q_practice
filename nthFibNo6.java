    
import java.util.Scanner;
public class nthFibNo6
{
    
    public static int  printNthFib(int nt)
    {
       if(nt==0 || nt==1)
       {
           return nt;
       }
        

       int a=0;
       int b=1;
            
     for(int i=2; i<=nt; i++)
        {
            int c=a+b;
        
               a=b;
                b=c;
        
       }
       return b;
    
    }
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int nt = sc.nextInt();

 int ans =printNthFib(nt);
 
 System.out.print(ans+" ");
 
 
	}
}





//check given number is present in fibonacci
// series or not

/*import java.util.Scanner;
public class Main
{
    public static boolean  checkG1n(int g1n)
    {
        if(g1n==0 || g1n==1)
        {
            return true;
        }
        
        int a=0,b=1,c;
        for(int i=1; i<=g1n; i++)
        {
            c=a+b;
            if(g1n==c)
            {
                return true;
            }
            a=b;
            b=c;
            
        }
        return false;
    }

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int g1n = sc.nextInt();
 
boolean ans = checkG1n(g1n);
System.out.println(ans);




	}
}

 */