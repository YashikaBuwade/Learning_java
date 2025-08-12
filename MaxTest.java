
// Generics

// Finds the maximum between two values using compareTo().

class Maximum<T extends Comparable<T>> {
    T findMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}

public class MaxTest {
    public static void main(String[] args) {
        Maximum<Integer> maxInt = new Maximum<>();
        System.out.println("Max: " + maxInt.findMax(10, 20));

        Maximum<String> maxStr = new Maximum<>();
        System.out.println("Max: " + maxStr.findMax("Apple", "Banana"));
    }
}

