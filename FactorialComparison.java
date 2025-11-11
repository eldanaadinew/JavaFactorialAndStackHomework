public class FactorialComparison {

    public static long factorialRecursive(int n) {
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialFor(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static long factorialWhile(int n) {
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static long factorialDoWhile(int n) {
        long fact = 1;
        int i = 1;
        if (n >= 0) {
            do {
                fact *= i;
                i++;
            } while (i <= n);
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 15; // Change this value to test
        long start, end;

        start = System.nanoTime();
        factorialFor(n);
        end = System.nanoTime();
        System.out.println("For Loop Time: " + (end - start) + " ns");

        start = System.nanoTime();
        factorialWhile(n);
        end = System.nanoTime();
        System.out.println("While Loop Time: " + (end - start) + " ns");

        start = System.nanoTime();
        factorialDoWhile(n);
        end = System.nanoTime();
        System.out.println("Do...While Loop Time: " + (end - start) + " ns");

        start = System.nanoTime();
        factorialRecursive(n);
        end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");

        System.out.println("\nTime Complexity for all methods: O(n)");
        System.out.println("Recursive approach adds function call overhead, so it's slightly slower.");
    }
}
