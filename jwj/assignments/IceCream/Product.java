package IceCream;

public class Product 
{
   private String name;
   private float price;
   private boolean cone;

   public Product(String name, float price, boolean cone)
   {
     this.name = name;
     this.price = price;
     this.cone = cone;
   }
   public String getDescription() 
   {
     return name + " " + cone + ":  $" + price;
   }
   public float getPrice() 
   {
     return price;
   }
}

