package classFolder.session12;

import java.util.Scanner;
import java.util.regex.Pattern;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
}

class IndianPhoneNumber extends PhoneNumber {

    public IndianPhoneNumber(String phNo) {
        super("+91", phNo);
    }

}

public class ExceptionTaskTwo {

    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNumeric(String str) { 
        try {  
          Long.parseLong(str);  

          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }

    public static void validate(String email,String password,String firstName,String lastName,String[] phoneNumbers) throws IllegalArgumentException{
        
        if(!isAlpha(firstName))
            throw new IllegalArgumentException("Invalid First Name");
        
        if(!isAlpha(lastName))
            throw new IllegalArgumentException("Invalid Last Name");
        
        if(!Pattern.matches("^(.+)@(.+)$", email))
            throw new IllegalArgumentException("Invalid Email");

        if( (password.length()<8) || (password.length()>16) || (!Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%]).{8,20}$", password))){
            throw new IllegalArgumentException("Invalid Password");
        } 
        
        for (String s : phoneNumbers) {
            if(!isNumeric(s))
                throw new IllegalArgumentException("Invalid Phone Number");
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details below:");
        String email = sc.nextLine();
        String password = sc.nextLine();
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String[] phoneNumber = { sc.nextLine(), sc.nextLine() };

        validate(email, password, firstName, lastName, phoneNumber);

        String fullName = firstName + " " + lastName;
        IndianPhoneNumber[] objPhoneNumbers = new IndianPhoneNumber[phoneNumber.length];
        for (int i = 0; i < phoneNumber.length; i++) {
            objPhoneNumbers[i] = new IndianPhoneNumber(phoneNumber[i]);
        }

        System.out.println(String.format("%n%nFull Name: %s%nEmail: %s%nPhone Numbers: %s, %s%n", fullName, email,
                objPhoneNumbers[0], objPhoneNumbers[1]));

            
            sc.close();
    }
}
