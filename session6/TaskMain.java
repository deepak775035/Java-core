package session6;

class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.lastname = "Das";
    }

    Parent(String firstname) {
        this();  //Added
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(String firstname) {
       // super(firstname);
       this.firstname=firstname; //changed
    }

    @Override
    public String toString() {
        System.out.println("CHILD OBJECT::");
     // return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
        return super.toString();   //Changed
    }
}

public class TaskMain{
    public static void main(String[] args) {
        // Parent parent = new Parent("Ram");
        // System.out.println(parent);

        Child child = new Child("sam");
        System.out.println(child);
    }
}
