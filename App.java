import java.util.Scanner;

public class App{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        FoodTemplate food=new FoodTemplate();
        
        int SubTotal=0;
        
        while(true){
          
        System.out.println("Enter food name");
        food.name = sc.nextLine();
        
        if (food.name.equalsIgnoreCase("Enter")) {
                break; //to stop order;
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
           System.out.println("Enter discount  percentage: ");
           int DiscountPercentage=sc.nextInt();
           Amount=FoodTemplate.DiscountPercentage(SubTotal,(double)DiscountPercentage);
           }
        }

        
       //calculate VAT
        double AmountAfterVAT=FoodTemplate.VAT( Amount );
        
        
       System.out.println("Total Amount:"+AmountAfterVAT);

       sc.close();
    }
    
    
    // For searching
      public static void Search(String a) {
        
    // for Item adder
      if (a.trim().equalsIgnoreCase("item adder")) {
         System.out.println("Item Adder");
//         itemAdder();
    }
      
      // for searching inventory
      if (a.trim().equalsIgnoreCase("Inventory")){
        System.out.println("Inventory");
//       inventory();
      }
      
      // for searching Analytics
      if (a.trim().equalsIgnoreCase("Analytics")){
      System.out.println("Analytics");
//      Analytics();
      
      }
      
}
     
      public void menu(){
        
      Scanner sc = new Scanner( System.in );
      System.out.println("Choose Catogory");
      System.out.println("Main Course");
      System.out.println("Side Dish");
      System.out.println("Dessert");
      System.out.println("Beverage");
      
      String input = sc.nextLine();
      
      
      if ( input.equalsIgnoreCase("Main course")){
         mainCourse();
       }
      
      else if ( input.equalsIgnoreCase("side dish")){
         sideDish();
       }
      
      else if ( input.equalsIgnoreCase("Dessert")){
         dessert();
       }
      
      else if ( input.equalsIgnoreCase("Bevarage")){
         bevarage();
       }
      else {
      System.out.println("Wrong Input");
      }
      
      
      }
      
      public void mainCourse(){
      FoodTemplate friedRice = new FoodTemplate();
      friedRice.foodAdder("Fried rice", 200, 300);
      FoodTemplate.details(friedRice);
      
      FoodTemplate palou = new FoodTemplate();
      palou.foodAdder("Palou", 200, 300);
      FoodTemplate.details(palou);
      }
      
      public void sideDish(){
      FoodTemplate frenchFries = new FoodTemplate();
      frenchFries.foodAdder("French Fries", 100, 60);
      FoodTemplate.details(frenchFries);
      
      FoodTemplate pasta = new FoodTemplate();
      pasta.foodAdder("Pasta", 150, 300);
      FoodTemplate.details(pasta);
      }
      
      public void dessert(){
      FoodTemplate mishti = new FoodTemplate();
      mishti.foodAdder("Mishti", 300, 100);
      FoodTemplate.details(mishti);
      
      FoodTemplate cake = new FoodTemplate();
      cake.foodAdder("Cake", 600, 300);
      FoodTemplate.details(cake);
      }
      
      public void bevarage(){
      FoodTemplate fanta = new FoodTemplate();
      fanta.foodAdder("Fanta", 20, 10);
      FoodTemplate.details(fanta);
      
      FoodTemplate lemu = new FoodTemplate();
      lemu.foodAdder("Lemu", 20, 10);
      FoodTemplate.details(lemu);
      }
     
 }