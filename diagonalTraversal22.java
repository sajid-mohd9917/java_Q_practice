// diagonal traversal of array


import java.util.Scanner;
public class diagonalTraversal22
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();

int[][]arr= new int[n][n];

for(int i=0; i<n; i++)
{
    
for(int j=0; j<n; j++)
{
    arr[i][j]=sc.nextInt();
}
}



for(int g=0; g<arr.length; g++)
{
    for(int i=0,  j=g; j<arr.length; j++, i++)
    {
        System.out.print(arr[i][j]+" ");
    }
    
}





	}
}