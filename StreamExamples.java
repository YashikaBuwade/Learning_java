import java.util.*;
import java.util.stream.*;

public class StreamExamples {
    public static void main(String[] args) {

        // 1️⃣ Filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println("-----------------------------");

        // 2️⃣ Sum of integers
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum: " + sum);

        System.out.println("-----------------------------");

        // 3️⃣ Combining filter + map + sum
        int evenSquareSum = numbers.stream()
                                   .filter(n -> n % 2 == 0)   // Keep even numbers
                                   .map(n -> n * n)           // Square each number
                                   .mapToInt(Integer::intValue)
                                   .sum();
        System.out.println("Sum of even squares: " + evenSquareSum);

        System.out.println("-----------------------------");

        // 4️⃣ Creating Streams examples

        // From Collection
        Stream<String> stream1 = List.of("a", "b", "c").stream();
        stream1.forEach(System.out::print); // abc
        System.out.println();

        // From Array
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1, 2, 3});
        stream2.forEach(System.out::print); // 123
        System.out.println();

        // Using Stream.of()
        Stream<String> stream3 = Stream.of("x", "y", "z");
        stream3.forEach(System.out::print); // xyz
        System.out.println();

        // Primitive Streams
        IntStream intStream = IntStream.range(1, 5); // 1 to 4
        intStream.forEach(System.out::print); // 1234
        System.out.println();
    }
}

