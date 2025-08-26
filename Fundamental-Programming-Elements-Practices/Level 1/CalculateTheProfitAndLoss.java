public class CalculateTheProfitAndLoss {
    public static void main(String[] args) {
        int selling=191;
        int cost_price=129;
        System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling);
        System.out.println("Than Selling Profit is INR "+(selling-cost_price)+" and the Profit Percentage is "+(((selling-cost_price)*100f)/cost_price));
    }
}
