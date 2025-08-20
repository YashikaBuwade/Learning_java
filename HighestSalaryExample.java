import java.util.*; // Importing utility classes like List, Arrays, Optional
// import java.util.stream.*; // Importing Stream API classes

// Employee class to store employee name and salary
class Employee {
    String name;   // Stores the name of the employee
    double salary; // Stores the salary of the employee

    // Constructor to initialize Employee objects
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class HighestSalaryExample {
    public static void main(String[] args) {
        
        // Creating a list of employees using Arrays.asList()
        List<Employee> employees = Arrays.asList(
            new Employee("Yashika", 50000),
            new Employee("Tanishtha", 75000),
            new Employee("Ritika", 60000)
        );

        // Using Stream API to find the highest paid employee
        // employees.stream() → Converts List into a Stream
        // reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2)
        //   → Compares two employees at a time, keeps the one with higher salary
        // Returns an Optional<Employee> because the list may be empty
        Optional<Employee> highestPaid = employees.stream()
            .reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2);

        // ifPresent(...) → Runs the given code only if a value exists in Optional
        // Prints the highest paid employee's name and salary
        highestPaid.ifPresent(e -> 
            System.out.println("Highest Paid: " + e.name + " - " + e.salary)
        );
    }
}

