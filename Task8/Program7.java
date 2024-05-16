import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any text");
        String string = obj.nextLine();
        int a = string.length();
        System.out.println("the length of the string is" + " " + +a);
    }
}