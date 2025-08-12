import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Yashika");
        names.add("Tanishtha");
        names.add("Yashika"); // duplicates allowed

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1); // duplicate ignored

        System.out.println("List: " + names);
        System.out.println("Set: " + numbers);
    }
}

