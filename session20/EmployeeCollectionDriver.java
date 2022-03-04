package session20;

import java.util.ArrayList;
import java.util.List;

class Employee {
    protected long   employeeId;
    protected String firstName;
    protected String lastName;

    

    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    
    public Boolean isEqual(Employee other){
        if(other==null)return false;
        if(!(other instanceof Employee))return false;
        if(this==other)return true;
        return this.employeeId == other.employeeId && this.firstName.equals(other.firstName);
    }

}

public class EmployeeCollectionDriver {
    public static void main(String[] args) {
        

        List<Employee> myList = new ArrayList<>();
        myList.add(new Employee(101, "Deepak", "Kumar"));
        myList.add(new Employee(102, "Jane", "Doe"));
        myList.add(new Employee(103, "Rohit", "Sharma"));

        // for (Employee employee : myList) {
        //     System.out.println(employee);
        // }

        myList.forEach(n -> System.out.println(n));
        System.out.println("\n");
        myList.forEach(System.out::println);

        System.out.println(myList.get(1).isEqual(myList.get(0)));
    }
}
