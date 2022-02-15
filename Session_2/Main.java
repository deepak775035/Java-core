package Session_2;

public class Main{
    
    
        //type                size(Byte)
        static boolean booleanVar;   //1bit
        static byte byteVar;         //1
        static short shortVar;       //2
        static int intVar;           //4
        static long longVar;         //8
        static float floatVar;       //4
        static double doubleVar;     //8
        static char charVar;         //2
        static String stringVar;     //2byte*length
    
    
    
    public static void main(String[] args) {


        System.out.println("boolean: "+ booleanVar);
        System.out.println("byte: "+ byteVar);
        System.out.println("short: "+ shortVar);
        System.out.println("int: "+ intVar);
        System.out.println("long: "+ longVar);
        System.out.println("float: "+ floatVar);
        System.out.println("double: "+ doubleVar);
        System.out.println("char: "+ charVar);
        System.out.println("String: "+ stringVar);


/////////////////////////////////////////////////////////////////////////   line-break   ////////
        System.out.println("\n\n");
/////////////////////////////////////////////////////////////////////////////////

        booleanVar=true;
        byteVar=12;
        shortVar=5;
        intVar=90;
        longVar=555555555;
        floatVar=122.555f;
        doubleVar=102.567;
        charVar='b';
        stringVar="Deepak";

         
        System.out.println("boolean: "+ booleanVar);
        System.out.println("byte: "+ byteVar);
        System.out.println("short: "+ shortVar);
        System.out.println("int: "+ intVar);
        System.out.println("long: "+ longVar);
        System.out.println("float: "+ floatVar);
        System.out.println("double: "+ doubleVar);
        System.out.println("char: "+ charVar);
        System.out.println("String: "+ stringVar);
    }
}