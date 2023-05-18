    
import java.util.Scanner;
public class anyBaseSubtraction14
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");

Scanner sc =new Scanner(System.in);

int n1=sc.nextInt();
int n2 = sc.nextInt();
int b=sc.nextInt();


int sum=0;
    int c=0;
int p=1;
while(n1>0)
{
    int rem1=n1%10;
    int rem2=n2%10;
    
    n1=n1/10;
    n2=n2/10;
    
    rem1=rem1+c;
    int rem;
    if(rem1>=rem2)
    {
        c=0;
         rem =rem1-rem2;
    }
    else
    {
        c=-1;
         rem =rem1+b-rem2;
    }
    
    sum =sum + rem*p;
    p=p*10;
}

System.out.println(sum);



	}
}