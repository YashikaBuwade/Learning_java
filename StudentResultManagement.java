import java.util.Scanner;

// Base class
class Person {
    protected String name;
    protected int rollNo;

    public Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

// Derived class
class Student extends Person {
    private int[] marks = new int[3]; // 3 subjects
    private int total;
    private String grade;

    public Student(String name, int rollNo, int[] marks) {
        super(name, rollNo);
        this.marks = marks;
        calculateTotal();
        calculateGrade();
    }

    private void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    private void calculateGrade() {
        float average = total / 3f;
        if (average >= 90) grade = "A+";
        else if (average >= 75) grade = "A";
        else if (average >= 60) grade = "B";
        else if (average >= 40) grade = "C";
        else grade = "F";
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Marks    : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total    : " + total);
        System.out.println("Grade    : " + grade);
    }

    public static void printHeader() {
        System.out.println("=== Student Result Management System ===");
    }
}

// Main class
public class StudentResultManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.printHeader();

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks should be between 0 and 100");
                }
            }

            Student s1 = new Student(name, roll, marks);
            s1.displayResult();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

