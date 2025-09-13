import java.util.Scanner;
public class CompareStringInLowerCase {
    public static char[] compareString(String str){
        char[] lowerChar=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                int ascii=(int)(ch);
                lowerChar[i]=(char)(ascii+32);
            }
            else{
                lowerChar[i]=ch;
            }
        }
        return lowerChar;
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
        char[] lowerChar=compareString(str);
        char[] lowerChar1=new char[str.length()];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            lowerChar1[i]=str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            System.out.print(lowerChar[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<str.length();i++){
            System.out.print(lowerChar1[i]+" ");
        }
        System.out.println("");
        System.out.println(check(lowerChar,lowerChar1));
    }
}
