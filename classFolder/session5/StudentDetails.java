package classFolder.session5;

public class StudentDetails {

  static int autoRollNoIncrementer = 0;
  static final String UNIVERSITY_NAME = "CU";

  private int rollNo;
  private String name;
  private String hometown;

  public StudentDetails() {
    rollNo = ++autoRollNoIncrementer;
    name = "Unknown";
    hometown = "Unknown";
  }

  public StudentDetails(String name) {
    this();
    this.name = name;
  }

  public StudentDetails(String name, String hometown) {
    this(name);
    this.hometown = hometown;
  }

  @Override
  public String toString() {
    return (
      "StudentDetails [rollNo=" + rollNo +
      ", name=" + name +
      ", hometown=" + hometown +
      ", Univesity=" + UNIVERSITY_NAME +
      "]"
    );
  }

  public static void main(String[] args) {
    StudentDetails s1, s2, s3;

    s1 = new StudentDetails();
    s2 = new StudentDetails("xyzz");
    s3 = new StudentDetails("SAM", "NYC");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
