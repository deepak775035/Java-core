package session14;

public class WordReversal {
    
    public static void printReveredWord(String str) {
        String[] strArr = str.split(" ");
        
        for (int i = strArr.length-1; i > -1 ; i--) {
            System.out.print(new StringBuilder(strArr[i]).reverse()+" ");
        }

        // for (String string : strArr) {
        //     System.out.print(new StringBuilder(string).reverse()+" ");
        // }
        
    }
    
    public static void main(String[] args) {
        String str = "India Is my country";
        System.out.println(str);
        printReveredWord(str);
    }
}
