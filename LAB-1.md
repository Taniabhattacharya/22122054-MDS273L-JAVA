Question:
--------------------------------------------------------------------------------------------
Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".

Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, and necessary validations.



 PROGRAM:
  ---------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class LabED {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter the name of the Employee : ");
    String name = sc.nextLine();

    System.out.print("Please enter the age of the Employee : ");
    int age = sc.nextInt();
    
    
    System.out.print("Please enter the gender of the Employee (m/f): ");
    
    sc.nextLine();
    char gender = sc.nextLine().charAt(0);
   
    System.out.print("Please enter the state of the Employee : ");
    String location = sc.nextLine();
   
    System.out.print("Please enter the company name of the Employee : ");
    String company = sc.nextLine();

    System.out.println("\nEmployee Details are:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

    if (gender == 'm') {
      System.out.println("Gender: MALE");
    } else if (gender == 'f') {
      System.out.println("Gender: FEMALE");
    }
      switch (location) {

        case "Jammu & Kashmir":
        case "Himachal Pradesh":
        case "Punjab":
        case "Uttarakhand":
        case "Haryana":
        case "Delhi":
        case "Rajasthan":
        case "Uttar Pradesh":
        case "UT Chandigarh":
            System.out.print("The Employee is from the northern states of India; Preferable work location is in "+location);
            break;

         
         case "Andhra Pradesh":
         case "Karnataka":
         case "Kerala":
         case "Tamil Nadu":
         case "Telangana":
         System.out.print("The Employee is from the Southern states of India; Preferable work location is in "+location);
            break;

        case "Arunachal Pradesh":
        case "Assam":
        case "Manipur":
        case "Meghalaya":
        case "Mizoram":
        case "Nagaland":
        case "Sikkim":
        case "Tripura":
            System.out.print("The Employee is from the east states of India; Preferable work location is in "+location);
            break;

        case "Goa":
        case "Gujarat":
        case "Maharashtra":
        case "Daman":
        case "Diu":
        case "Dadra Nagar Haveli":
            System.out.print("The Employee is from the western states of India; Preferable work location is in "+location);
            break;

        
      }
    

    String[] topMncCompanies = {"Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple"};
    String isTopMnc = "";

    for (String mnc : topMncCompanies) {
      if (company.equalsIgnoreCase(mnc)) {
        isTopMnc = mnc;
        break;
      }
      
    }

    if (isTopMnc.equalsIgnoreCase("Facebook") || isTopMnc.equalsIgnoreCase("Google") || isTopMnc.equalsIgnoreCase("Samsung") || isTopMnc.equalsIgnoreCase("Microsoft") || isTopMnc.equalsIgnoreCase("IBM") || isTopMnc.equalsIgnoreCase("Apple") ) {
          System.out.println("The employee is working in Top MNC Companies");
    }else{
        System.out.println("The company is "+company);
    }
    

 }
   
}
