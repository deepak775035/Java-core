package session14;

public class StringTaskOne {


    static boolean isSubstring(
        String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
 
        for (int i = 0; i <= N - M; i++) {
            int j;
 
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                    != s1.charAt(j))
                    break;
 
            if (j == M)
                return true;
        }
 
        return false;
    }

    static void areSubStrings(String mainStr, String[] possibleStr){
        int noOfQuries = possibleStr.length;
        int currentQuery=0;
    
        while(currentQuery<noOfQuries){
            if(!isSubstring(possibleStr[currentQuery++], mainStr)){
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }

    public static void main(String[] args) {
        String mainStr = "Impossible";
        
        String[] possibleString = {"ss","b"};

        areSubStrings(mainStr,possibleString);
    }
}
