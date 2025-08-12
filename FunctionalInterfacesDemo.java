import java.util.function.*;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        System.out.println("=== 1. Predicate<T> ===");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println("isEven.test(4): " + isEven.test(4)); // true
        System.out.println("AND: " + isPositive.and(isEven).test(4)); // true
        System.out.println("OR: " + isPositive.or(isEven).test(-2)); // true
        Predicate<String> isHello = Predicate.isEqual("Hello");
        System.out.println("isEqual: " + isHello.test("Hello")); // true

        System.out.println("\n=== 2. Function<T, R> ===");
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("apply: " + lengthFunction.apply("Java")); // 4

        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add3 = n -> n + 3;

        System.out.println("andThen: " + multiplyBy2.andThen(add3).apply(5)); // 13
        System.out.println("compose: " + multiplyBy2.compose(add3).apply(5)); // 16
        Function<String, String> identityFunc = Function.identity();
        System.out.println("identity: " + identityFunc.apply("Hello")); // Hello

        System.out.println("\n=== 3. Consumer<T> ===");
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Consumer");

        System.out.println("\n=== 4. Supplier<T> ===");
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomSupplier.get());

        System.out.println("\n=== 5. BiPredicate<T, U> ===");
        BiPredicate<String, String> startsWith = (str, prefix) -> str.startsWith(prefix);
        System.out.println("startsWith.test(\"Java\", \"Ja\"): " + startsWith.test("Java", "Ja")); // true

        System.out.println("\n=== 6. BiFunction<T, U, R> ===");
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("sum.apply(5, 3): " + sum.apply(5, 3)); // 8

        System.out.println("\n=== 7. BiConsumer<T, U> ===");
        BiConsumer<String, Integer> printNameAge = (name, age) ->
                System.out.println(name + " is " + age + " years old");
        printNameAge.accept("Yashika", 22);
    }
}

