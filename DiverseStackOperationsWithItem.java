import java.util.Stack;

public class DiverseStackOperationsWithItem {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        Stack<Boolean> booleanStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>();
        Stack<Item> itemStack = new Stack<>();

        // Push elements
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        booleanStack.push(true);
        booleanStack.push(false);
        booleanStack.push(true);

        doubleStack.push(1.1);
        doubleStack.push(2.2);
        doubleStack.push(3.3);

        itemStack.push(new Item("Item1", 100));
        itemStack.push(new Item("Item2", 200));
        itemStack.push(new Item("Item3", 300));

        System.out.println("String Stack Operations:");
        processStack(stringStack);

        System.out.println("\nInteger Stack Operations:");
        processStack(integerStack);

        System.out.println("\nBoolean Stack Operations:");
        processStack(booleanStack);

        System.out.println("\nDouble Stack Operations:");
        processStack(doubleStack);

        System.out.println("\nItem Stack Operations:");
        processStack(itemStack);

        System.out.println("\nEmpty Stack Check:");
        System.out.println("String Stack Empty: " + stringStack.isEmpty());
        System.out.println("Integer Stack Empty: " + integerStack.isEmpty());
        System.out.println("Boolean Stack Empty: " + booleanStack.isEmpty());
        System.out.println("Double Stack Empty: " + doubleStack.isEmpty());
        System.out.println("Item Stack Empty: " + itemStack.isEmpty());
    }

    private static <T> void processStack(Stack<T> stack) {
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }
    }
}
