    
import java.util.Scanner;
public class anyBaseAddition14
{
	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);

int n1=sc.nextInt();
int n2 = sc.nextInt();
int b=sc.nextInt();

int c=0;
int p=1;
int sum =0;
while(n1>0 || n2>0 || c>0)
{
    int rem1=n1%10;
    int rem2=n2%10;
    
    int rem3=rem1 + rem2 +c;
    
    c=rem3/b;
    int rem=rem3%b;
    
    sum= sum + rem*p;
    p=p*10;
    
    n1=n1/10;
    n2=n2/10;
}

System.out.println(sum);

	}
}
