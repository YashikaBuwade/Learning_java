import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println("ArrayList: " + list);

        list = new LinkedList<>();
        list.add("HTML");
        list.add("CSS");

        System.out.println("LinkedList: " + list);

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");

        System.out.println("Stack Pop: " + stack.pop());
    }
}

