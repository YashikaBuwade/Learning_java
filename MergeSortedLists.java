import java.util.*;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 6, 7, 9);

        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(list1);
        set.addAll(list2);

        System.out.println("Merged Sorted List: " + set);
    }
}

