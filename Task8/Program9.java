import java.util.Scanner;
public class Program9 {
    public static void seniorCitizenOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("Person is a senior citizen");
        } else {
            System.out.println("Person is not a senior citizen");
        }
    }

    public static void main(String[] args) {
        Program9.seniorCitizenOrNot();
    }
}