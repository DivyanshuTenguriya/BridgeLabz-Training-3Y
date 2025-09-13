import java.util.*;

public class StringIndexOutOfBoundsDemo {
    public static void exceptionGenerator(String str){
        System.out.println(str.charAt(str.length()));
    }
    public static void handleException(String str){
        try {
            System.out.println(str.charAt(str.length()));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        try {
            exceptionGenerator(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        handleException(str);
    }
}