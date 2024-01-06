import java.util.Scanner;
public class Collatz{
    public static boolean isEven (long x) {
        return x % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter integer: ");
        long num = keyboard.nextLong();
        System.out.printf("%n");
        int odd_count = 0, even_count = 0;
        while (num > 1) {
            if (isEven(num)) {
                even_count++;
                System.out.println("Number is even\n");
                num /= 2;
                System.out.println("New Number is " + num + "\n");
            }
            else {
                odd_count++;
                System.out.println("Number is odd\n");
                num = (3 * num) + 1;
                System.out.println("New number is " + num + "\n");
            }
        }
        System.out.println("Final number is " + num);
        System.out.println("Final number of even numbers in the process: " + even_count);
        System.out.println("Final number of odd numbers in the process: " + odd_count);
    }
}
