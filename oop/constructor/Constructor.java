// What is a constructor?
// Constructor is a method/function with the same name as the class
// Whenever a object is created of a class, the constructor is called. 
// If there is no constructor created, Java provides default constructors

class Employee {
    int empId;
    String empName;
    String empType;

    public void showInfo() {
        System.out.println(empId + " : " + empName + " : " + empType);
    }
    // showInfo() is a method that will show employee details

    Employee() {
        System.out.println("Calling constructor...");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee person1 = new Employee(); // Creating a object with the name "person1" of Employee class
        person1.empId = 10001; // Setting employee ID
        person1.empName = "Rafsun"; // Setting employee Name
        person1.empType = "Full Time";// Setting employment type

        person1.showInfo(); // Showing details
    }

}