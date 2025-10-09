import java.util.Scanner;

public class LengthWithoutLength {
    public static int userDefine(String str){
        int count=0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return count;

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text here : ");
        String str=sc.next();
        System.out.println("Length of String is "+userDefine(str));
    }
}
