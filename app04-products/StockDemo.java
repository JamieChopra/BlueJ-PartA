    
    
    import java.util.Random;
    /**
     *
     * Demonstrate the StockManager and Product classes.
     * The demonstration becomes properly functional as
     * the StockManager class is completed.
     * 
     * @author David J. Barnes and Michael Kölling.
     * @version 2016.02.29
     * Modified by Jamie Chopra
     */
    public class StockDemo
    {   
        public static final int FIRST_ID = 101;
        
        // The stock manager.
        private StockManager manager;
        
        private Product product;
        
        private Random generator;
        
        private String name = "P";
        /**
         * Create a StockManager and populate it with a few
         * sample products.
         */
        public StockDemo(StockManager manager)
        {
            
            generator = new Random();
            this.manager = manager;
            
            int id = FIRST_ID;
            
            manager.addProduct(new Product(101, "Apple"));
            manager.addProduct(new Product(102, "Pineapple"));
            manager.addProduct(new Product(103, "Water Melon"));
            manager.addProduct(new Product(104, "Banana"));
            manager.addProduct(new Product(105, "Cherries"));
            manager.addProduct(new Product(106, "Grapes"));
            manager.addProduct(new Product(107, "Lemon"));
            manager.addProduct(new Product(108, "Mango"));
            manager.addProduct(new Product(109, "Pear"));
            manager.addProduct(new Product(110, "Peaches"));
        }
        
        public void startswithProduct()
          {
         for(int id = 101; id <= 110; id++)
               {
            if(name.startsWith("P"))
            {
                manager.printDetails(id);
                System.out.println("Products starting with P are: " + id);
            }
        }
        }
        
         /**
         * Provide a very simple demonstration of how a StockManager
         * might be used. Details of one product are shown, the
         * product is restocked, and then the details are shown again.
         */
        public void runDemo()
        {
            // Show details of all of the products.
            System.out.println("\n################################");
            System.out.println("##    Jamie's Stock List      ##");  
            System.out.println("################################\n");
            
            manager.printAllProducts();
            
            demoDelivery();
            
            demoSell();
        }
        
        /**
         * Delivery method in which the stock is increased using a for statement.
         */
        private void demoDelivery()
        {
            printHeading("Delivery");
            
            int amount = 0;
          
            for(int id = 101; id <= 110; id++)
            { 
                amount = generator.nextInt(7) + 1;
                manager.deliverProduct(id, amount);
                amount++;
            }
            
        }
        
        private void printHeading(String verb)
        {
          System.out.println();
          System.out.println("Demonstrating the Product " + verb);
          System.out.println();
        }
        
        /**
         * Delivery method in which the stock is increased using a for statement.
         */
         private void demoSell()
         {
          printHeading("Sell");
          
          int amount = 0;
          
          for(int id = 101; id <= 110; id++)
            { 
                amount = generator.nextInt(7) + 1;
                manager.sellProduct(id, amount);
            }
        }
    
        public void printLowStock(int amount)
        {
            for(int id = 101; id <= 110; id++)
         { 
          if(amount > 2)
          {
            System.out.println("Stock levels are low for IDs: " + id);
          }
         }
        }
}