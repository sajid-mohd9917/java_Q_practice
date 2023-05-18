    
import java.util.Scanner;
public class anyBaseToDecimal13
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");

Scanner sc =new Scanner(System.in);

int n=sc.nextInt();
int b = sc.nextInt();

int p=1;
int sum =0;
while(n>0)
{
    int rem=n%10;
    n=n/10;
    
    sum= sum + rem*p;
    p=p*b;
}


System.out.println(sum);Z

	}
}