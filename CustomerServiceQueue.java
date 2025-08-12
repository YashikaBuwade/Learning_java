import java.util.*;

public class CustomerServiceQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>(); // Queue to store customer names

        while (true) {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. View Queue\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add multiple customers
    while (true) {
        System.out.print("Enter customer name (or type 'done' to stop): ");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("done")) { // stop adding customers
            break;
        }
        queue.offer(name); // add to queue
        System.out.println(name + " added to the queue.");
    }
    break;

                case 2: // Serve customer
                    String served = queue.poll(); // poll() removes from queue head
                    if (served != null) {
                        System.out.println("Serving: " + served);
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;

                case 3: // View queue
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Current Queue: " + queue);
                    }
                    break;

                case 4: // Exit
                    System.out.println("Closing service counter...");
                    System.exit(0);
            }
        }
    }
}

