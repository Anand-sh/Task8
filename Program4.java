import java.util.Scanner;
public class Program4 {
    public void swapValues() {
        String c = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        String a = scanner.next();
        System.out.println("Enter the value of b");
        String b = scanner.next();
        c = b;
        b = a;
        a = c;
        System.out.println("swapped value of a is" + " " + a);
        System.out.println("swapped value of b is" + " " + b);
    }

    public static void main(String[] args) {
        Program4 s = new Program4();
        s.swapValues();
    }
}