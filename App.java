import java.util.Scanner;

public class App{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        FoodTemplate food=new FoodTemplate();
        
        int SubTotal=0;
        
        while(true){
          
        System.out.println("Enter food name");
        food.name=sc.nextLine();
        
        if (food.name.equalsIgnoreCase("Enter")) {
                break;//to stop order;
            }
        
        System.out.println("Enter price");
        food.price=sc.nextInt();
        
        System.out.println("Enter quantity");
        food.quantity=sc.nextInt();
        
         sc.nextLine();
        FoodTemplate.details(food);
       
        
        //billing
        int Bill=FoodTemplate.Bill(food.price,food.quantity);
        
        SubTotal+=Bill;
       
        }
        //add discount
        double Amount = SubTotal;
        
        System.out.println("Do you want to add a discount?");
        System.out.println("If yes,press 0;otherwise press 1");
        
        int number=sc.nextInt();
        
        if(number==0){
          
           System.out.println("Amount or Percentage?");
           System.out.println("For Amount,press 0;otherwise press 1");
           
           int num=sc.nextInt();
          
           if(num==0){
           System.out.println("Enter discount amount:");
           int DiscountAmount=sc.nextInt();
           Amount=FoodTemplate.DiscountAmount(SubTotal,(double)DiscountAmount);
        }
           else{
           System.out.println("Enter discount  percentage:");
           int DiscountPercentage=sc.nextInt();
           Amount=FoodTemplate.DiscountPercentage(SubTotal,(double)DiscountPercentage);
           }
        }
      
        
        
       //calculate VAT
        double AmountAfterVAT=FoodTemplate.VAT(Amount);
        
        
       System.out.println("Total Amount:"+AmountAfterVAT);

       sc.close();
    }
 }