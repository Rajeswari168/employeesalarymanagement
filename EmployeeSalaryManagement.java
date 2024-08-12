import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double allowances;

    public Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}

public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline

            employees[i] = new Employee(name, id, basicSalary, allowances);
            System.out.println();
        }

        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}