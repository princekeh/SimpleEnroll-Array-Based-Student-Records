// StudentManagementSystem (Project Name) 
// StudentManagementSystem.java (Class) 



import java.util.Scanner;

/**
 * A simple Student Record Management System.
 * Allows administrators to add, update, and view student details.
 */
public class StudentManagementSystem {

    // Student information storage using individual static arrays
    static int maxStudents = 100;
    static String[] studentNames = new String[maxStudents];
    static int[] studentIDs = new int[maxStudents];
    static int[] studentAges = new int[maxStudents];
    static String[] studentGrades = new String[maxStudents];
    static int studentCount = 0; // Total number of students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Administrator interface loop
        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    viewStudent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Method to add a new student
    public static void addStudent(Scanner scanner) {
        if (studentCount >= maxStudents) {
            System.out.println("Cannot add more students. Storage full.");
            return;
        }

        System.out.print("Enter Student ID (numbers only): ");
        int id = scanner.nextInt();

        // Check if ID already exists
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i] == id) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        scanner.nextLine(); // Clear buffer
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Clear buffer
        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        studentIDs[studentCount] = id;
        studentNames[studentCount] = name;
        studentAges[studentCount] = age;
        studentGrades[studentCount] = grade;
        studentCount++;

        System.out.println("Student added successfully.");
    }

    // Method to update student information
    public static void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        int index = findStudentIndexById(id);

        if (index == -1) {
            System.out.println("Student ID not found.");
            return;
        }

        scanner.nextLine(); // Clear buffer
        System.out.print("Enter new name: ");
        studentNames[index] = scanner.nextLine();

        System.out.print("Enter new age: ");
        studentAges[index] = scanner.nextInt();

        scanner.nextLine(); // Clear buffer
        System.out.print("Enter new grade: ");
        studentGrades[index] = scanner.nextLine();

        System.out.println("Student information updated successfully.");
    }

    // Method to view student details
    public static void viewStudent(Scanner scanner) {
        System.out.print("Enter Student ID to view: ");
        int id = scanner.nextInt();
        int index = findStudentIndexById(id);

        if (index == -1) {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentNames[index]);
        System.out.println("ID: " + studentIDs[index]);
        System.out.println("Age: " + studentAges[index]);
        System.out.println("Grade: " + studentGrades[index]);
    }

    // Helper method to find student index by ID
    public static int findStudentIndexById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i] == id) {
                return i;
            }
        }
        return -1; // Not found
    }
}
