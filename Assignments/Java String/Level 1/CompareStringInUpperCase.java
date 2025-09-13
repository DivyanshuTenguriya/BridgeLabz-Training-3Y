import java.util.Locale;
import java.util.Scanner;

public class CompareStringInUpperCase {
    public static char[] compareString(String str){
        char[] upperChar=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                int ascii=(int)(ch);
                upperChar[i]=(char)(ascii-32);
            }
            else{
                upperChar[i]=ch;
            }
        }
        return upperChar;
    }
    public static boolean check(char[] arr1,char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] upperChar=compareString(str);
        char[] upperChar1=new char[str.length()];
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            upperChar1[i]=str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            System.out.print(upperChar[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<str.length();i++){
            System.out.print(upperChar1[i]+" ");
        }
        System.out.println("");
        System.out.println(check(upperChar,upperChar1));
    }
}
