import java.util.Scanner;
public class npr2
{
    
    public static int  nprFunc(int n, int r)
    {
        int nfact =1;
        for(int i=1; i<=n; i++)
        {
            nfact = nfact*i;
        }
        
        int fact2 =1;
        for(int i=1; i<=n-r; i++)
        {
            fact2 = fact2*i;
        }
        
        
        int npr =nfact/fact2;
        
        return npr;
    }
    
    
    
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    
    int npr= nprFunc(n,r);
    	System.out.println(n+"P"+r+" = "+npr);
    
     
     
     
	}
}







/*import java.util.Scanner;
public class Main
{
    
   public static int factorial(int n)
   {
       int fact=1;
    for(int i=1; i<=n; i++)
    {
        fact=fact*i;
    }
    return fact;
   }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();

int nfact=factorial(n);

int rfact=factorial(r);

int nmrfact=factorial(n-r);

int npr=nfact/nmrfact;

System.out.println(n+"P"+r+"= "+npr);

int ncr= nfact/(nmrfact*rfact);

System.out.println(n+"C"+r+"= "+ncr);


	}
}
 */