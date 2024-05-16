public class Program1 {
    public static void main(String[] args) {
        int a = -30;
        int b = 20;
        int c = 20;
        int d = 30;

        if (a + b > c + d) {
            System.out.println("the sum of a and b is greater than the sum of c and d");
        } else if (a + b < c + d) {
            System.out.println("the sum of a and b is less than the sum of c and d");
        } else if (a + b == c + d) {
            System.out.println("the sum of a and b is equal to the sum of c and d");
        }
    }
}
