public class ShoppingCart {
    public static void main(String[] args) {

        String customerName = "Hazwan";
        String item1 = "Rice";
        double item1Price = 35.00;
        String item2 = "Eggs";
        double item2Price = 12.50;
        String item3 = "Cooking Oil";
        double item3Price = 42.75;

        double totalCost;
        int discount = 10;
        double costAfterDiscount;

        totalCost = item1Price + item2Price +item3Price;
        if (totalCost > 100 ){
            costAfterDiscount = totalCost - (totalCost * discount /100);
        }
        else{
            costAfterDiscount = totalCost;
        }

        System.out.println("Receipt for : " + customerName + " \n"
                + " ----------------------------\n"
                + item1 + " : RM" + item1Price + " \n "
                + item2 + " : RM" + item2Price + " \n "
                + item3 + " : RM" + item3Price + " \n "
                + "Total Cost: " + totalCost   + " \n"
                + "Discount: " + discount   + " \n"
                + " ----------------------------\n"
                + "Final Total: " + costAfterDiscount   + " \n"
                + " ----------------------------\n"
        );
    }
}
