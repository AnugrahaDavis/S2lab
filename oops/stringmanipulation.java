import java.util.*;
public class stringmanipulation {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("Length of the string is : "+ s.length());
        System.out.println("Uppercase: "+ s.toUpperCase());
        System.out.println("Lowercase : "+ s.toLowerCase());
        System.out.println("Character at position 0 : "+ s.charAt(0));
        System.out.println("substring of the string: "+ s.substring(0,4));
        System.out.println("comparing both strings : "+ s.equals("anuyadhu"));
       
    }
    
}
