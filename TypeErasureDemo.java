import java.util.ArrayList;

// Type Erasure, which means generic type information is removed at compile time, making all generic types behave as raw types at runtime.

public class TypeErasureDemo {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(); // Compares ArrayList<String> and ArrayList<Integer> classes at runtime.
        ArrayList<Integer> intList = new ArrayList<>();

        if (strList.getClass() == intList.getClass()) {
            System.out.println("Due to type erasure, both have same class at runtime.");  // make me remember
        }
    }
}


