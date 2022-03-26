package classFolder.session22;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String mainStr = "I have I I need two I bana have becuse I have this";
        String[] strArr = mainStr.split(" ");

        Map<String, Integer> myMap = new HashMap<>();
        for (String string : strArr) {
            if (myMap.containsKey(string)) {
                myMap.put(string, myMap.get(string) + 1);
            }
            else myMap.put(string, 1);
        }

        for (Map.Entry<String,Integer> e : myMap.entrySet()) {
            System.out.println(e.getKey()+" :"+e.getValue());
        }
    }
}
