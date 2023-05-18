    import java.util.*;
    import java.io.*;
import java.util.Scanner;
public class  Anotes1
{
    
   public static boolean fascinating(long n)
    {
        // code here
        String str=n+""+n*2+n*3;
      
        
        for(int i=0; i<str.length(); i++)
        {
            char val=str.charAt(i);
           
            
                 if(val=='0')
            {
                continue;
            }
            System.out.println(i+","+val);
            System.out.println("hello");
            int count=0;
            for(int j=0; j<str.length(); j++)
            {
                
                if(val==str.charAt(j))
                {
                    count++;
                }
                System.out.print(" "+j+",");
            }
            System.out.println(count);
            if(count!=1)
            {
                System.out.println("ct"+count);
                return false;
            }
        }
        
        
        
        return true;
        
        
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        // int num=6;
        // String str = ""+num+num*2+num*3;
        // String str =num+num*2+""+num*3+num*4;
        // System.out.println(str);
        
        
        // double sqrt = (float)Math.pow(10, 0.5);
        // long sqrt = (int)Math.pow(10, 5);
        // float sqrt = (int)Math.pow(10, 0.5); 
        // System.out.println(sqrt);
        // System.out.format("%.2f",sqrt);
            


        boolean ans= fascinating(x);

        System.out.println(ans);



	}
}


