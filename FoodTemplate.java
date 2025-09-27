public class FoodTemplate
{
    public String name;
    public int price;
    public int estimatedTime; // in seconds

    // for printing the object
    public static void details(FoodTemplate food)
    {
        System.out.println("Name: " + food.name);
        System.out.println("Price: " + food.price);
        System.out.println("Estimated Time: " + food.estimatedTime + " seconds");
    }
}