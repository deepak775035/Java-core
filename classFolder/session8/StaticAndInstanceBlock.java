package classFolder.session8;

public class StaticAndInstanceBlock {

    static{
        System.out.println("yo Static here");
        String[] my = {"hi,yo"};
        main(my);
    }

    {
        System.out.println("hey Instance here");
    }

  public static void main(String[] args) {

        new StaticAndInstanceBlock();
        System.out.println("hey main here");
        
  }
}
