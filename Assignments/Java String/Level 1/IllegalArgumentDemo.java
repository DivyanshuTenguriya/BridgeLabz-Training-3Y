import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String str) {
        System.out.println("Substring: " + str.substring(5, 2));
    }
    public static void handleException(String str) {
        try{
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        try {
            generateException(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        handleException(str);
    }
}
