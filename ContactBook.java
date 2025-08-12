import java.util.*; // Importing utility package for Scanner & ArrayList

// Contact class to represent each contact entry
class Contact {
    private String name;  // Stores contact name
    private String phone; // Stores contact phone number

    // Constructor to initialize contact details
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getter methods to access private fields
    public String getName() { return name; }
    public String getPhone() { return phone; }

    // toString() method to display contact details in readable form
    @Override
    public String toString() {
        return name + " - " + phone;
    }
}

public class ContactBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        ArrayList<Contact> contacts = new ArrayList<>(); 

        while (true) { 
            System.out.println("\n1. Add Contact\n2. View Contacts\n3. Delete Contact\n4. Exit");
            int choice = scan.nextInt(); // Taking  choice
            scan.nextLine(); // Consuming newline character after integer input

            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scan.nextLine();
                    contacts.add(new Contact(name, phone)); // Adding new Contact object to ArrayList
                    System.out.println("Contact added!");
                    break;

                case 2: // View all contacts
                    if (contacts.isEmpty()) { // Check if list is empty
                        System.out.println("No contacts found.");
                    } else {
                        for (Contact c : contacts) { // display all contacts
                            System.out.println(c);
                        }
                    }
                    break;

                case 3: // Delete contact by name
                    System.out.print("Enter name to delete: ");
                    String delName = scan.nextLine();
                    contacts.removeIf(c -> c.getName().equalsIgnoreCase(delName)); // Lambda to remove matching contact
                    System.out.println("Contact deleted (if found).");
                    break;

                case 4: // Exit program
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}


