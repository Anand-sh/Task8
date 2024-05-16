import java.util.Scanner;

public class Program10 {
    public static void countInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value:");
        int age = scanner.nextInt();
        int count = 0;
        while (age != 0) {
            age /= 10;
            count++;
        }
        System.out.println("Total integer count is:" + count);
    }

    public static void main(String[] args) {
        Program10.countInteger();
    }
}