import java.util.Scanner;

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean keepAdding=true;
        do{
            System.out.println("Enter number of items you want to buy");
            int n=sc.nextInt();
            int total=0;
            for(int i=1;i<=n;i++){
                System.out.println("Choose items from menu list given below");
                System.out.println("1.Bread ₹60");
                System.out.println("2.Milk ₹70/l");
                System.out.println("3.Banana ₹50/kg");
                System.out.println("4.Rice ₹120/kg");
                int choice=sc.nextInt();
                int price=0;
                switch(choice){
                    case 1:
                        System.out.println("How many packets of bread you want");
                        int br=sc.nextInt();
                        price=60*br;
                        break;
                    case 2:
                        System.out.println("How much milk you want");
                        int m=sc.nextInt();
                        price=m*70;
                        break;
                    case 3:
                        System.out.println("How much banana you want");
                        int b=sc.nextInt();
                        price=b*50;
                        break;
                    case 4:
                        System.out.println("How much rice you want");
                        int r=sc.nextInt();
                        price=r*120;
                        break;
                    default:
                        System.out.println("Invalid product.So, we are adding a packet of bread ₹60");
                        price=60;
                }
                total+=price;
            }
            int discounted=0;
            if(total>5000){
                System.out.println("As you total is "+total+", we are giving you discount of 20%");
                discounted=(int)(total*0.8);
                System.out.println("Now, your discounted total is "+discounted);
            }
            else{
                System.out.println("Your total is "+total);
            }
            System.out.println("Do you want to add more? (y/n)");
            String ans=sc.next();
            if(ans.equalsIgnoreCase("n")){
                keepAdding=false;
            }
        }while(keepAdding);
        System.out.println("Thank you for being our costumer.Have a nice day");
    }
}
