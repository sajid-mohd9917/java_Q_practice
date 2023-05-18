    
import java.util.Scanner;
public class lcm_hcf9
{
   

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


int n1=sc.nextInt();
int n2=sc.nextInt();

int N1=n1;
int N2=n2;
// int N1=n1;
// int N2=n2;

// while(n1%n2>0)
//     {
//         int r=n1%n2;
         
         
//         n1=n2;
//          n2=r;
      
        
        
//     }
//     int gcd=n2;
//     System.out.println("greastest common divisor ="+gcd);
    
//     int lcm=(N1*N2)/gcd;
//     System.out.println(lcm);



while(n1%n2>0)
{
    int rem=n1%n2;
    n1=n2;
    n2=rem;

}

int gcd=n2;
int lcm=(N1 *N2)/gcd;
System.out.println(gcd);
System.out.println(lcm);

	}
}

