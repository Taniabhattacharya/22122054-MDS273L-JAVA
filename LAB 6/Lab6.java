import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String regNo;
    private String name;
    private String email;
    private String phone;
    private String classNo;
    private String department;

    public Student(String regNo, String name, String email, String phone, String classNo, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classNo = classNo;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Registration No: " + this.regNo);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Class: " + this.classNo);
        System.out.println("Department: " + this.department);
    }

    public String toString() {
        return this.regNo + "," + this.name + "," + this.email + "," + this.phone + "," + this.classNo + "," + this.department;
        }

    public String getName() {
        return this.name;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Lab6 {
    private static Student[] students = new Student[100];
    private static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Update the details of a student");
            System.out.println("4. Display all students");
            System.out.println("5. Save the details of each student in a file");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                saveToFile();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        if (size == 100) {
            System.out.println("No more students can be added.");
            return;
        }

        System.out.print("Enter registration no: ");
        String regNo = scanner.next();

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.print("Enter phone: ");
        String phone = scanner.next();

        System.out.print("Enter class: ");
        String classNo = scanner.next();

        System.out.print("");
    }}