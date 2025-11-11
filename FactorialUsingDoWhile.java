import java.util.Scanner;

public class FactorialUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        long factorial = 1;
        int i = 1;

        if (n >= 0) {
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }

        System.out.println("Factorial of " + n + " using do...while loop is: " + factorial);
        sc.close();
    }
}
