import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " using while loop is: " + factorial);
        sc.close();
    }
}
