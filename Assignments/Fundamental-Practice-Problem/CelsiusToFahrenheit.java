import java.util.Scanner;

public class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Celsius=scn.nextInt();
        int Fahrenheit=(Celsius*9/5)+32;
        System.out.println(Fahrenheit);
    }
}
