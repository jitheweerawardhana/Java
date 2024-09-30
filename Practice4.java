import java.util.Scanner;

class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Employee ID: ");
            String employeeID = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(name, employeeID, salary);
        }

        for (Employee employee : employees) {
            employee.salaryIncrement();
        }

        System.out.println("\nUpdated Employee Details After Salary Increments:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }

        System.out.print("\nEnter Employee ID to search: ");
        String searchID = scanner.nextLine();
        findEmployeeById(employees, searchID);

        double totalSalary = calcTotalSalary(employees);
        System.out.println("\nTotal Salary of All Employees: " + totalSalary);
    }

    public static void findEmployeeById(Employee[] employees, String searchID) {
        boolean found = false;

        for (Employee employee : employees) {
            if (employee.employeeID.equals(searchID)) {
                employee.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee Not Found");
        }
    }

    public static double calcTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        return totalSalary;
    }
}

class Employee {
    String name;
    String employeeID;
    double salary;

    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void salaryIncrement() {
        if (salary >= 100000) {
            salary += salary * 0.10;
        } else if (salary >= 80000) {
            salary += salary * 0.02;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeID + ", Salary: " + salary);
    }
}
