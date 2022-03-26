package classFolder.session14;

public class TrimAString {


    static String trimFun(String s) {
        
        int i;
        int j;

        for (i = 0; s.charAt(i) == ' '; i++) ;
        for (j = s.length(); s.charAt(j) == ' '; j--) ;

        return s.substring(i, j+1);
    }

    public static void main(String[] args) {
        String str = "         Java Python   ";
        System.out.println(str +"\nlength=" +str.length());
        str = trimFun(str);
        System.out.println(str +"\nlength=" +str.length());
    }
}
