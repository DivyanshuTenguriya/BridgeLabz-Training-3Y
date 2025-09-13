import java.sql.SQLOutput;

public class NullPointerException {
    public static void main(String[] args) {
        String text=null;
        try{
            System.out.println(text.length());
        }
        catch (Exception e){
            System.out.println("Null pointer Exception");
        }
    }
}
