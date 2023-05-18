    
import java.util.Scanner;

public class pythagorusThr_10 
{
   

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int max;
if(a>b && a>c)
{
    max=a;
}
else if(b>a && b>c)
{
    max=b;
}
else{
    max=c;
}


boolean ans=false;
if(max==a)
{
    if(a*a==(b*b)+(c*c))
    {
                ans=true;
    }
}
else if(max==b)
{
    if(b*b==(a*a)+(c*c))
    {
        ans=true;
    }
}
else
{
    if(c*c==(a*a)+(b*b))
    {
        ans=true;
    }
}

System.out.println(ans);



}
}







    
// import java.util.Scanner;
// public class pythagorusThr_10 
// {
   

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();

// int max;
// if(a>b && a>c)
// {
//     max=a;
// }
// else if(b>a && b>c)
// {
//     max =b;
// } 
// else {
//     max=c;
// }




// if(max==a)
// {
//     boolean ans= (a*a==(b*b)+(c*c));
//     {
//         System.out.println(ans);
//     }
// }
// else if(max==b)
// {
//     boolean ans=(b*b==(a*a)+(c*c));
//     {

//         System.out.println(ans);
//     }
// }
// else
// {
//     boolean ans=(c*c==(a*a)+(b*b));
//     {
//         System.out.println(ans);
// }

// }



// }
// }








// int a=10;
// int b=20;

// boolean ans = (a==b);
// System.out.println(ans);