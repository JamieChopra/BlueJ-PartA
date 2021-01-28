
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    public InputReader input;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
    }

    /**
     * Runs the Program
     */
    public void run()
    {
        printHeading();
        while(true)
        {
            getMenuChoice();
        }
    }
    
    /**
     * Method that prints all menu choices and gets user input to make choice.
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printMenuChoices();
           
            String choice = input.getInput();
            finished = true;
        }
    }
    
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Search:     Print products based on a part of their name");
        System.out.println("    Deliver:    Chose an ID then deliver stock to it");
        System.out.println("    Sell:       Chose an ID then sell an amount of stock from it");
        System.out.println("    Low:        Print a list of products with low stock");
        System.out.println("    ReStock:    Restock all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Jamie Chopra");
        System.out.println("******************************");
    }
}
