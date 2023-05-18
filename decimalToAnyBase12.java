
import java.util.Scanner;

public class decimalToAnyBase12 {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int p = 1;
        int sum = 0;
        while (n > 0) {
            int rem = n % b;
            n = n / b;

            sum = sum + rem * p;
            p = p * 10;
        }

        System.out.println(sum);

    }
}