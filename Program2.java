import java.util.Scanner;
public class Program2 {
    public void action() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println("Given number is Even number");
        } else {
            System.out.println("It is not an even number");
        }
    }
    public static void main(String[] args) {
        Program2 s = new Program2();
        s.action();
    }
}