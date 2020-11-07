import java.util.Random;
/**
 *
 * 
 * 
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{   
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Clock Radio"));
        manager.addProduct(new Product(102,  "Mobile Phone"));
        manager.addProduct(new Product(103,  "Microwave Oven"));
        manager.addProduct(new Product(104, "Clock Radio"));
        manager.addProduct(new Product(105,  "Mobile Phone"));
        manager.addProduct(new Product(106,  "Microwave Oven"));
        manager.addProduct(new Product(107, "Clock Radio"));
        manager.addProduct(new Product(108,  "Mobile Phone"));
        manager.addProduct(new Product(109,  "Microwave Oven"));
        manager.addProduct(new Product(110, "Clock Radio"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        
        demoDelivery();
        
        manager.printAllProducts();
    }
    
    /**
     * Delivery method in which the stock is increased using a for statement.
     */
    private void demoDelivery()
    {
      int amount = 1;
      
      for(int id = 101; id <= 110; id++)
        { 
            manager.deliverProduct(id, amount);
            amount++;
        }
    }
}
