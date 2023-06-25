package TH1;

public class GenericStackClient {


    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfStrings();
        System.out.println("2. Stack of integers");
        stackOfIntegers();
    }
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println(stack); // One, Two, Three, Four, Five
        System.out.println("Size after push: " + stack.size());
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Size after pop: " + stack.size());
        System.out.println(stack);

    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // 5 4 3 2 1
        System.out.println("Size after push: " + stack.size()); // 5
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Size after pop: " + stack.size()); // 0
        System.out.println(stack);
    }
}

