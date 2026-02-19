

import java.util.Scanner;

// Define Employee class
class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor
    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    // Display method
    public void display() {
        System.out.println("Employee No : " + eNo);
        System.out.println("Employee Name : " + eName);
        System.out.println("Employee Salary : " + eSalary);
    }
}

// Main class
public class Employeesearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Create array of Employee objects
        Employee[] emp = new Employee[n];

        System.out.println("\nEnter employee details\n");

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter eNo: ");
            int eNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter eName: ");
            String eName = sc.nextLine();

            System.out.print("Enter eSalary: ");
            double eSalary = sc.nextDouble();

            // Create object and store in array
            emp[i] = new Employee(eNo, eName, eSalary);
        }

        // Search employee by eNo
        System.out.print("\nEnter Employee number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}


