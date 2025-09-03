import java.util.Scanner;

public class ThreeFrinds {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String[] name={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter Age of "+(i+1));
            age[i]=sc.nextInt();
            System.out.println("Enter the height of "+(i+1));
            height[i]=sc.nextInt();
        }
        int max=height[0];
        int min=age[0];
        for(int i=0;i<3;i++){
            if(max<height[i]){
                max=height[i];
            }
            if(min>age[i]){
                min=age[i];
            }
        }
        int youngest=0;
        int tallest=0;
        for(int i=0;i<3;i++){
            if(max==height[i]){
                tallest=i;
            }
            if(min==age[i]){
                youngest=i;
            }
        }
        System.out.println("The tallest one from three friends is "+name[tallest]+" and his height is "+max);
        System.out.println("the youngest one from three friends is "+name[youngest]+" and his age is "+min);

    }
}
