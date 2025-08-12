import java.util.*;


// test wildcard

// Prints any type of list (List<String>, List<Double>, etc.

//  Demonstrates how ? wildcard makes a method flexible for different data types.

public class WildCard {
    static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        List<Double> marks = Arrays.asList(87.5, 90.0, 76.3); // it will show double value also

        printList(colors);
        printList(marks);
    }
}
