public class FoodTemplate
{
    public String name;
    public int price;
    public int quantity;
    public int estimatedTime; // in seconds

    // for printing the object
    public static void details(FoodTemplate food)
    {
        System.out.println("Name: " + food.name);
        System.out.println("Price: " + food.price);
        System.out.println("Quantity: " + food.quantity);
        System.out.println("Estimated Time: " + food.estimatedTime + " seconds");
    }

    //for the bill
    public static int Bill(int price,int quantity){
      int bill=price*quantity;
      return bill;
    }
    
   //for discount
    public static double DiscountAmount(double SubTotal,double Discount){
      
     double amount=SubTotal-Discount;
     return amount;
    }
    
    public static double DiscountPercentage(double SubTotal,double Discount){
      
     double amount=SubTotal-(SubTotal*Discount)/100;
     return amount;
    }
    
    //for the VAT
    public static double VAT(double bill){
      double Bill_after=bill+bill*.15;
      return Bill_after;
    }


}