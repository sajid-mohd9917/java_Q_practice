    import java.util.*;
import java.util.Scanner;
public class  primeFactorisation8
{
   

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
ArrayList<Integer> list =new ArrayList<>();
int n = sc.nextInt();
// int k = sc.nextInt();
for(int div=2; div<=n; div++)
{
    while(n%div==0)
    {
        n=n/div;
        // System.out.print(div+" ");
        list.add(div);
    }   
    
}

System.out.println(list);
// for(int val : list)
// {
//     System.out.println(list.get(val)+" ");
// }

	}
}





