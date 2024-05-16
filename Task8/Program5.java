import java.util.Scanner;

public class Program5 {
    public void primeNumber() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = Scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Entered number is prime number");
        } else {
            System.out.println("Entered number is not a prime number");
        }
    }

    public static void main(String[] args) {
        Program5 prime = new Program5();
        prime.primeNumber();
    }
}