import java.util.*;
import java.io.*;

public class lab6 {
    public static void Add_Student(Student[] students) {  
        Scanner scan = new Scanner(System.in);  
        int counter = 0;
        System.out.print("Enter the student name: ");
        String name = scan.nextLine();

        System.out.print("Enter the student Registeration number: ");
        String rollNo = scan.nextLine();

        System.out.print("Enter the student Class: ");
        String Class = scan.nextLine();

        System.out.print("Enter the student Department: ");
        String depart = scan.nextLine();

        System.out.print("Enter the student phone number: ");
        String phoneNumber = scan.nextLine();

        System.out.print("Enter the student Email: ");
        String email = scan.nextLine();

        students[counter] = new Student(name, rollNo, email, depart, phoneNumber, Class);
        System.out.println("Student Added Succesfulll");
        students[counter].Display();
        counter++;
    }

    public static void SearchStudent(Student[] students) {
        int choicei;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Search by name");
            System.out.println("2. Search by roll number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choicei = scan.nextInt();
            scan.nextLine();

            switch (choicei) {
                case 1:
                    System.out.print("Enter the name of the student to search for: ");
                    String Searched_name = scan.nextLine();
                    boolean foundByName = false;
                    for (Student student : students) {
                        if (student != null && student.name.equalsIgnoreCase(Searched_name)) {
                            student.Display();
                            foundByName = true;
                            break;
                        }
                    }
                    if (!foundByName) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the Registration number of the student to search for: ");
                    String Searched_rollNo = scan.nextLine();
                    foundByName = false;
                    for (Student student : students) {
                        if (student != null && student.regNo.equalsIgnoreCase(Searched_rollNo)) {
                            student.Display();
                            foundByName = true;
                            break;
                        }
                    }
                    if (!foundByName) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choicei != 0);

    }

    public static void UpdateStudent(Student[] students){
        int choicei;
        Scanner scan = new Scanner(System.in);

                    do {
                        System.out.println("Menu:");
                        System.out.println("1. Search by name");
                        System.out.println("2. Search by roll number");
                        System.out.println("0. Exit");
                        System.out.print("Enter your choice: ");
                        choicei = scan.nextInt();
                        scan.nextLine();

                        switch (choicei) {
                            case 1:
                                System.out.print("Enter the name of the student to search for: ");
                                String Searched_name = scan.nextLine();
                                boolean foundByName = false;
                                for (Student student : students) {
                                    if (student != null && student.name.equalsIgnoreCase(Searched_name)) {
                                        do {
                                            System.out.println("Menu:");
                                            System.out.println("1. Update Name");
                                            System.out.println("2. Update Reg. No");
                                            System.out.println("3. Update Class");
                                            System.out.println("4. Update Department");
                                            System.out.println("5. Update Phone Number");
                                            System.out.println("6. Update Email");
                                            System.out.println("0. Exit");
                                            System.out.print("Enter your choice: ");
                                            choicei = scan.nextInt();
                                            scan.nextLine();
                    
                                            switch (choicei) {
                                                case 1:
                                                System.out.println("Current Name");
                                                System.out.println(student.name);
                                                System.out.println("Please Enter Name");
                                                String Inputed_name = scan.nextLine();
                                                student.name = Inputed_name;
                                                System.out.println("Name Updated Sucessfull");
                                                break;

                                                case 2:
                                                System.out.println("Current Reg. No");
                                                System.out.println(student.regNo);
                                                System.out.println("Please Enter Registration Number");
                                                Inputed_name = scan.nextLine();
                                                student.regNo = Inputed_name;
                                                System.out.println("Regristration Number Updated Sucessfull");
                                                break;

                                                case 3:
                                                System.out.println("Current Class");
                                                System.out.println(student.Class);
                                                System.out.println("Please Enter Class");
                                                Inputed_name = scan.nextLine();
                                                student.Class = Inputed_name;
                                                System.out.println("Class Updated Sucessfull");
                                                break;

                                                case 4:
                                                System.out.println("Current Department");
                                                System.out.println(student.DepartMent);
                                                System.out.println("Please Enter Department");
                                                Inputed_name = scan.nextLine();
                                                student.DepartMent = Inputed_name;
                                                System.out.println("Department Updated Sucessfull");
                                                break;

                                                case 5:
                                                System.out.println("Current Phone Number");
                                                System.out.println(student.Phone);
                                                System.out.println("Please Enter Phone Number");
                                                Inputed_name = scan.nextLine();
                                                student.Phone = Inputed_name;
                                                System.out.println("Phone Number Updated Sucessfull");
                                                break;

                                                case 6:
                                                System.out.println("Current Email");
                                                System.out.println(student.email);
                                                System.out.println("Please Enter Email");
                                                Inputed_name = scan.nextLine();
                                                student.email = Inputed_name;
                                                System.out.println("Email Updated Sucessfull");
                                                break;

                                                case 0:
                                                break;

                                            }
                                        }while (choicei != 0);
                                        
                                    }
                                }
                                if (!foundByName) {
                                    System.out.println("Student not found.");
                                }
                                break;
                            case 2:
                                System.out.print("Enter the Registration number of the student to search for: ");
                                String Searched_rollNo = scan.nextLine();
                                foundByName = false;
                                for (Student student : students) {
                                    if (student != null && student.regNo.equalsIgnoreCase(Searched_rollNo)) {
                                        student.Display();
                                        foundByName = true;
                                        break;
                                    }
                                }
                                if (!foundByName) {
                                    System.out.println("Student not found.");
                                }
                                break;
                            case 0:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    } while (choicei != 0);


    }

    public static void WriteINTOFile(Student[] students){
        String csvFilePath = "data.csv";
        for (Student student : students) { 
            

        }

    }

    public static void main(String[] args) {
        Student[] students = new Student[100];
        Scanner scan = new Scanner (System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Search a student");
            System.out.println("3. Update a student");


            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    Add_Student(students);
                    WriteINTOFile(students);
                    break;

                case 2:
                    SearchStudent(students);
                    break;

                case 3:
                    UpdateStudent(students);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scan.close();
    }

}

class Student {
    String name;
    String regNo;
    String email;
    String DepartMent;
    String Class;
    String Phone;

    Student(String name, String regNo, String email, String DepartMent, String Phone, String Class) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
        this.DepartMent = DepartMent;
        this.Phone = Phone;
        this.Class = Class;
    }

    public void Display() {
        System.out.println("Name : " + this.name);
        System.out.println("Student Class : " + this.Class);
        System.out.println("Student Department : " + this.DepartMent);
        System.out.println("Phone Number : " + this.Phone);
        System.out.println("Email : " + this.email);
        System.out.println("Registration Number : " + this.regNo);
    }

    public String toString() {
        return this.name + "," + this.Class + "," + this.DepartMent + "," + this.Phone + "," + this.email + "," + this.regNo;
    }

}
