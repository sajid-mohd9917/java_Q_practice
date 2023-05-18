import java.util.*;

public class z2Dmat {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int k = 0;

        int[] arr1 = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(arr1);
        k = 0;
        for (int i = 0; i < m; i++)
         {
            for (int j = 0; j < n; j++)
             {
                arr[i][j] = arr1[k];
                ;
                k++;
            }
        }

        int sum = arr[m - 1][n - 3] + arr[m - 1][n - 2] 
        + arr[m - 1][n - 1] + arr[m - 2][n - 2] + 
        arr[m - 3][n - 3]
        + arr[m - 3][n - 2] + arr[m - 3][n - 1];

        System.out.println(sum);

        // for (int i = 0; i < m; i++)
        // {
        // for (int j = 0; j < n; j++)
        // {
        // System.out.print(arr[i][j]+" ") ;
        // }
        // System.out.println();
        // }

        int sum;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[0].length - 1; j++)
            {
                 sum = 0;
                sum += arr[i][j];

                sum += arr[i - 1][j - 1];
                sum += arr[i - 1][j];
                sum += arr[i - 1][j + 1];

                sum += arr[i + 1][j - 1];
                sum += arr[i + 1][j];
                sum += arr[i + 1][j + 1];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

}
