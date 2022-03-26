package classFolder.session5;

public class Student {

  private int rollNo;
  private String name;

  // constructors
  Student() {
      rollNo=-1;
      name="Unknown";
  }

  Student(int rollNo) {
    this.rollNo = rollNo;
    name="Unknown";
  }

  Student(String name) {
    this.name = name;
    rollNo=-1;
  }

  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }


  //display
  protected void display(){
      System.out.println("RollNO:"+rollNo+"\nName:"+name);
  }

  //get and set
  
  public String getName() {
      return name;
  }

  public int getRollNo() {
      return rollNo;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
  }

  public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("deepak");
      s1.setRollNo(5);
      System.out.println(s1.getName());
      System.out.println(s1.getRollNo());
      s1.display();

  }

}
