import java.util.Scanner;

public class CompareString {
    public static char[] getChars(String str){
        char[] charat=new char[str.length()];
        for(int i=0;i<str.length();i++){
            charat[i]=str.charAt(i);
        }
        return charat;
    }
    public static boolean compareCharArrays(char[] arr1,char[] arr2){
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
        char[] userDefine=getChars(str);
        char[] inBuild=str.toCharArray();
        boolean isEquall=compareCharArrays(userDefine,inBuild);
        System.out.println(isEquall);
        for(int i=0;i<str.length();i++){
            System.out.print(userDefine[i]+" ");

        }
        System.out.println("");
        for(int i=0;i<str.length();i++){
            System.out.print(inBuild[i]+" ");

        }


    }
}
