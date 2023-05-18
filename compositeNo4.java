    

import java.util.Scanner;
public class compositeNo4
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
    if(ct!=2)
    {
        System.out.println("compo no ="+n+" ");
    }
    if(ct==2)
    {
        System.out.println("prime no ="+n+ " ");
    }
}





	}
}
