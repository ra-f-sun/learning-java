class Employee {
    int empId;
    String empName;
    String empType;

    public void showInfo() {
        System.out.println(empId + " : " + empName + " : " + empType);
    }

    Employee() {
        System.out.println("In constructor...");
    }

    // showInfo() is a method that will show employee details
}

// Here "Employee" is a class which is basically a blueprint of all employee

public class ClassObject {
    public static void main(String[] args) {
        Employee person1 = new Employee(); // Creating a object with the name "person1" of Employee class
        person1.empId = 10001; // Setting employee ID
        person1.empName = "Rafsun"; // Setting employee Name
        person1.empType = "Full Time";// Setting employment type

        // person1.showInfo(); // Showing details
    }
}
