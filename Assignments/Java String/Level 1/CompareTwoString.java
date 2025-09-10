import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();
        int str1l= str1.length();
        int str2l=str2.length();
        if(str1l>str2l){
            System.out.println("Strings are not equal");
        }
        else if(str2l>str1l){
            System.out.println("String are not egual");
        }
        else{
            for(int i=0;i<str1l;i++){
                System.out.println(str1.charAt(i)+"     "+str2.charAt(i));
            }
        }
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}