package session6;

class Person{
    private String name;

    public Person() {
        name="Unknown";
    }

    public Person(String name) {
        this();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
    
    

}


class Employee extends Person{
    private double salary;
    private int yearOfJoining;
    private String UAN;

    
    public Employee(double salary, int yearOfJoining, String uAN) {
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        UAN = uAN;
    }
    public Employee(String name, double salary, int yearOfJoining, String uAN) {
        super(name);
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        UAN = uAN;
    }


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getyearOfJoining() {
        return yearOfJoining;
    }
    public void setyearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
    public String getUAN() {
        return UAN;
    }
    public void setUAN(String uAN) {
        UAN = uAN;
    }
    @Override
    public String toString() {

        return "Employee [Name="+ super.getName() +" UAN=" + UAN + ", salary=" + salary + ", yearOfJoining=" + yearOfJoining + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((UAN == null) ? 0 : UAN.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + yearOfJoining;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (UAN == null) {
            if (other.UAN != null)
                return false;
        } else if (!UAN.equals(other.UAN))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (yearOfJoining != other.yearOfJoining)
            return false;
        return true;
    }
    
    
  
}


public class EmpMain {
    public static void main(String[] args) {
        Employee e1=new Employee("Rahul", 500000, 2023, "6689");
        Employee e2=new Employee("Rahul", 500000, 2023, "6689");
        Person p = new Person("deepak");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(p);

        System.out.println();

        System.out.println(e1==p);
        System.out.println(e1.equals(p));

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
        
    }
}
