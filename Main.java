import java.util.ArrayList;

public class Main {
    
    String modifyString(String str){

        char arr[] = str.toCharArray();

        ArrayList<Character> ans = new ArrayList<>();
        for(char x : arr){
            if(x==' '){
                ans.add('$');
                ans.add('$');
                ans.add('$');
                ans.add('$');
                ans.add('$');
            }
            else{
                ans.add(x);
                ans.add('$');
            }
        }

        String ansStr="";
        for (Character character : ans) {
            ansStr+=character;
        }


        return ansStr;
    }
    
    public static void main(String[] args) {
        String str = "Deepak Kumar";

        System.out.println(new Main().modifyString(str));

    }
}
