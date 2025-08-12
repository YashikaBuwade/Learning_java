

public class Generic {
    public static <T> void displayArray(T[] array) {// to create a generic method.
        for (T element : array) {
            System.out.print(element + " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = {"Harry Potter", "Snap"};
        Integer[] numbers = {1, 2, 3, 4};

        displayArray(names);
        displayArray(numbers);
    }
}

//  Prints elements of any type of array (String[], Integer[], etc.)



