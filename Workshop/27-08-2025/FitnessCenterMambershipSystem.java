import java.util.Scanner;
public class FitnessCenterMambershipSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean keeprun=true;
        do{
            System.out.println("Enter number of member want to register");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println("Choose your plan from the below list.");
                System.out.println("1.Monthly ₹1000");
                System.out.println("2.Quarterly ₹2700");
                System.out.println("3.Yearly ₹10000");
                int choice=sc.nextInt();
                int fee=0;
                switch(choice){
                    case 1:
                        System.out.println("You choose Monthly plan then you fee is " +1000);
                        fee=1000;
                        break;
                    case 2:
                        System.out.println("You choose quarterly plan then your fee is "+2700);
                        fee=2700;
                        break;
                    case 3:
                        System.out.println("You choose yearly plan then your fee is "+10000);
                        fee=10000;
                        break;
                    default:
                        System.out.println("Invalid plan.then your plan is monthly"+1000);
                        fee=1000;
                }
                System.out.println("Are you student or senior citizen or not ? (y/n)");
                String discount_c=sc.next();
                if(discount_c.equalsIgnoreCase("y")){
                    System.out.println("Are you student(s) or senior citizen(c) ?");
                    String dis=sc.next();
                    if(dis.charAt(0)=='s' || dis.charAt(0)=='S'){
                        fee=(int)(fee*0.8);
                        System.out.println("Student discount is applied");
                    }
                    else if(dis.charAt(0)=='c' || dis.charAt(0)=='C'){
                        fee=(int)(fee*0.7);
                        System.out.println("Senior Citizen Discount is applied");
                    }
                    else{
                        System.out.println("Invalid choice no discount is applied");
                    }
                }
                System.out.println("The fee for member"+i+" is ₹"+fee);
            }
            System.out.println("Do you want to register more members? (y/n)");
            String ans=sc.next();
            if(ans.equalsIgnoreCase("n")){
                keeprun=false;
            }
        }while(keeprun);
        System.out.println("Have a good day");
    }
}
