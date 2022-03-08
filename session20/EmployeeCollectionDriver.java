package session20;

import java.util.ArrayList;
import java.util.List;

class Employee implements Comparable<Employee> {
    protected long employeeId;
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

    public Boolean isEqual(Employee other) {
        if (other == null)
            return false;
        if (!(other instanceof Employee))
            return false;
        if (this == other)
            return true;
        return this.employeeId == other.employeeId && this.firstName.equals(other.firstName);
    }

    @Override
    public int compareTo(Employee o) {
        if (employeeId < o.employeeId)
            return -1;
        if (employeeId == o.employeeId)
            return 0;
        return 1;
    }

}

public class EmployeeCollectionDriver {
    public static void main(String[] args) {

        List<Employee> myList = new ArrayList<>();
        myList.add(new Employee(107, "Deepak", "Kumar"));
        myList.add(new Employee(102, "Jane", "Doe"));
        myList.add(new Employee(103, "Rohit", "Sharma"));

        // myList.forEach(n -> System.out.println(n));
        System.out.println("\nBefore sort");
        myList.forEach(System.out::println);

        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size() - 1 - i; j++) {
                if ((myList.get(j).compareTo(myList.get(j + 1))) > 0) {
                    Employee temp = myList.get(j);
                    myList.set(j, myList.get(j + 1));
                    myList.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nAfter sort");
        myList.forEach(System.out::println);

        if(myList instanceof List);
    }
}
