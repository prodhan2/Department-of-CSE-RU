import java.util.*;

class Student {
    private String name;
    private int age;
    private String grade;
    private List<String> coursesEnrolled;

    public Student(String name, int age, String grade, List<String> coursesEnrolled) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.coursesEnrolled = coursesEnrolled;
    }

    // Getters and setters for Student class (omitted for brevity)
}

class StudentRecordSystem {
    private Map<String, Student> studentDatabase;

    public StudentRecordSystem() {
        this.studentDatabase = new HashMap<>();
    }

    public void addStudentRecord(String studentID, String name, int age, String grade, List<String> coursesEnrolled) {
        // Create a new Student object
        Student newStudent = new Student(name, age, grade, coursesEnrolled);

        // Add the student to the database with the studentID as the key
        studentDatabase.put(studentID, newStudent);
    }

    public void deleteStudentRecord(String studentID) {
        // Check if the student exists
        if (studentDatabase.containsKey(studentID)) {
            // Remove the student from the database
            studentDatabase.remove(studentID);
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewStudentInformation(String studentID) {
        // Check if the student exists
        if (studentDatabase.containsKey(studentID)) {
            // Retrieve the student and display their details
            Student student = studentDatabase.get(studentID);
            System.out.println("Student Information:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Courses Enrolled: " + student.getCoursesEnrolled());
        } else {
            System.out.println("Student not found.");
        }
    }

    public void listAllStudents() {
        System.out.println("List of All Students:");
        for (Map.Entry<String, Student> entry : studentDatabase.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
        }
    }

    public static void main(String[] args) {
        StudentRecordSystem recordSystem = new StudentRecordSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Record System Menu:");
            System.out.println("1. Add Student Record");
            System.out.println("2. Delete Student Record");
            System.out.println("3. View Student Information");
            System.out.println("4. List All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Enter courses enrolled (comma-separated): ");
                    String coursesInput = scanner.nextLine();
                    List<String> coursesEnrolled = Arrays.asList(coursesInput.split(","));

                    recordSystem.addStudentRecord(studentID, name, age, grade, coursesEnrolled);
                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    System.out.print("Enter student ID to delete: ");
                    studentID = scanner.nextLine();
                    recordSystem.deleteStudentRecord(studentID);
                    break;

                case 3:
                    System.out.print("Enter student ID to view information: ");
                    studentID = scanner.nextLine();
                    recordSystem.viewStudentInformation(studentID);
                    break;

                case 4:
                    recordSystem.listAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting Student Record System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
