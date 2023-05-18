import java.util.Scanner;

public class printPrimeNo1
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);

  int ntm=sc.nextInt();


  int ct=0;
for(int n=2; n<=90; n++)
{
    int count=0;
    for(int j=1; j<=n; j++)
    {
       
        if(n%j==0)
        {
            count++;
        }
    }
    
    if(count==2)
    {
         ct++;

         if(ct==ntm){
        System.out.print(n+ " ");
        return;
         }
    }
}



	}
}




//print prime no upto N

/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int N=sc.nextInt();

for(int n=2; n<=N; n++)
{
    int ct=0;
    for(int div =1; div<=n; div++)
    {
        if(n%div==0)
        {
            ct++;
        }
    }
    if(ct==2)
    {
        System.out.print(n+" ");
    }
}





	}
}
 */






// check prime no
 /*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int N=sc.nextInt();

int ct=0;
for(int div =1; div<=N; div++)
{
    if(N%div==0)
    {
        ct++;
    }
}


if(ct==2)
{
    System.out.println("true");
    
}
else
{
 System.out.println("false");
}
 
 
	}
}
 */