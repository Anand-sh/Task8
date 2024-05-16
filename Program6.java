import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = Scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}