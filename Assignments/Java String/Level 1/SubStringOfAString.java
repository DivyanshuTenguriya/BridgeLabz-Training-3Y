import java.util.Scanner;

public class SubStringOfAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("Enter the starting of the substring");
        int start= sc.nextInt();
        System.out.println("Enter the ending of the substring");
        int end=sc.nextInt();
        String new1="";
        char ch='a';
        for(int i=start;i<end;i++){
            new1+=str.charAt(i);
        }
        String new2=str.substring(start,end);
        if(new1.equals(new2)){
            System.out.println("Sub String is correct");
        }
        else{
            System.out.println("Sub String is not correct");
        }
        System.out.println(new1);
    }

}
