    //exit point of a matrix


import java.util.Scanner;
public class exitPointMatrix22
{
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int r=sc.nextInt();
int c= sc.nextInt();
int [][]arr=new int[r][c];
for(int i=0; i<arr.length; i++)
{
    for(int j=0; j<arr[0].length; j++)
    {
        arr[i][j]=sc.nextInt();
    }
}

int i=0;
int j=0;
int d=0;
while(true)
{
    d=(d+arr[i][j])%4;
    
    if(d==0)
    {
        j++;
    }
    else if(d==1)
    {
        i++;
    }
    else if(d==2)
    {
        j--;
    }
    else if(d==3)
    {
        i--;
    }
    

    
    if(i==arr.length)
    {
        i--;
        break;
    }
    else if(i<0)
    {
        i++;
        break;
    }
    else if(j==arr[0].length)
    {
        j--;
        break;
    }
    else if(j<0)
    {
        j++;
        break;
    }
    
    
    
}

System.out.print(i+","+j);


    }
}
