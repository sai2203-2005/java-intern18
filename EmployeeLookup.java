import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name,
                    String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id
                + "\nName: " + name
                + "\nDepartment: " + department
                + "\nSalary: " + salary;
    }
}

public class EmployeeLookup {
    private static final Map<Integer, Employee> employees =
            new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Add sample employees
        addEmployee(new Employee(
                1001, "Siva", "IT", 45000));

        addEmployee(new Employee(
                1002, "Rahul", "HR", 40000));

        addEmployee(new Employee(
                1003, "Priya", "Finance", 50000));

        while (true) {
            System.out.println("\n--- Employee Lookup System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (employees.containsKey(id)) {
                        System.out.println(
                                "Employee ID already exists!");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    addEmployee(new Employee(
                            id, name, department, salary));

                    System.out.println("Employee added!");
                    break;

                case 2:
                    System.out.print("Enter employee ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    Employee employee = employees.get(searchId);

                    if (employee != null) {
                        System.out.println(employee);
                    } else {
                        System.out.println(
                                "Employee not found!");
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : employees.values()) {
                            System.out.println("----------------");
                            System.out.println(e);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();

                    if (employees.remove(removeId) != null) {
                        System.out.println("Employee removed!");
                    } else {
                        System.out.println(
                                "Employee not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
}
