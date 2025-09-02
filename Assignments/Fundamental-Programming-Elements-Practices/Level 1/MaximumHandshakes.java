import java.util.*;
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int combination=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The number of students are "+numberOfStudents+" and total number of handshakes are "+combination);
    }
}
