///1.	Create a program where:Employee class has attributes name and salary, and a method displayInfo().Manager class inherits from Employee and has an extra attribute department.Print all details using an object of Manager.
class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "John";
        m.salary = 75000;
        m.department = "IT";
        m.displayInfo();
    }
}
