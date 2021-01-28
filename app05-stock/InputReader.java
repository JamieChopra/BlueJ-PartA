import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 * Edited by Jamie Chopra
 */
public class InputReader {
    private Scanner reader;
    boolean firstInput = false;
    Manager inputManager = new Manager();

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader() {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return A String typed by the user.
     */
    public String getInput() {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();

        if(!firstInput)
        {
            takeInput(inputLine);
        }
        return inputLine;
    }

    /**
     * Method for the user to choose an option and calls the method
     * for each option chosen.
     * Uses boolean to stop the user from repeatedly entering the same option
     */
    public boolean takeInput(String takingInput)
    {
        if(takingInput.equals("Quit"))
        {
            firstInput = true;
            quitProgram();

        }
        else if(takingInput.equals("Add")){

            firstInput = true;
            addProduct();

        }
        else if(takingInput.equals("Remove"))
        {

            firstInput = true;
            removeProduct();
        }
        else if(takingInput.equals("PrintAll"))
        {
            firstInput = true;
            printAllProducts();
        }
        else if(takingInput.equals("Search"))
        {
            firstInput = true;
            searchProduct();
        }

        else if(takingInput.equals("Deliver"))
        {
            firstInput = true;
            deliverProduct();
        }

        else if(takingInput.equals("Sell"))
        {
            firstInput = true;
            sellProduct();
        }

        else if(takingInput.equals("Low"))
        {
            firstInput = true;
            lowStockProduct();
        }

        else if(takingInput.equals("ReStock"))
        {
            firstInput = true;
            reStockProduct();
        }

        else
            {
                firstInput = false;
                System.out.println("Did not recognise command entered");
                System.out.println("Re-enter command: ");
                getInput();
            }
        return firstInput;
    }

    /**
     * Quit method that terminates program.
     */
    public void quitProgram()
    {
        System.out.println("You have quit the program.");
        System.exit(0);
        firstInput = false;
    }

    /**
     * Add method that recieves user input and adds products name and id to the list.
     */
    public void addProduct()
    {
        String listName = getInput();
        String listID = getInput();
        int idInt = Integer.parseInt(listID);
        boolean b = true;

        for(int i = 0; i < inputManager.productList.size(); i++)
        {
            if(inputManager.productList.get(i).id == idInt)
            {
                System.out.println("Invalid ID, please re-enter your product with a different id.");
                addProduct();
                b = false;
            }
        }
        if(b && !listName.equals(""))
        {
            inputManager.addNewProduct(listName, idInt);
            System.out.println("You have added item: " + inputManager.productList.get(inputManager.productList.size() - 1).name + " to the product list.");
        }
        else if(listName.equals(""))
        {
            System.out.println("Invalid name, cannot leave blank");
            addProduct();
        }

        firstInput = false;
    }

    /**
     * Method for removing product from item list based on id.
     */
    public void removeProduct()
    {
        int brandNewID = Integer.parseInt(getInput());
        inputManager.removeProduct(brandNewID);
        firstInput = false;
    }

    /**
     * Method for searching for product on item list based on part of its name.
     */
    public void searchProduct()
    {
        inputManager.searchProduct(getInput());
        firstInput = false;
    }

    /**
     * Method for delivering an amount of product to an id.
     */
    public void deliverProduct()
    {
        int deliverID = Integer.parseInt(getInput());
        int stockNumber = Integer.parseInt(getInput());
        inputManager.deliverStock(deliverID, stockNumber);
        firstInput = false;
    }

    /**
     * Method for selling an amount of product from an id.
     */
    public void sellProduct()
    {
        int sellID = Integer.parseInt(getInput());
        int sellNumber = Integer.parseInt(getInput());
        inputManager.sellStock(sellID, sellNumber);
        firstInput = false;
    }

    /**
     * Method for printing a list of products with 3 or less stock.
     */
    public void lowStockProduct()
    {
        inputManager.lowStock();
        firstInput = false;
    }

    /**
     * Method for restocking products to 10.
     */
    public void reStockProduct()
    {
        inputManager.reStock();
        firstInput = false;
    }

    /**
     * Method for printing all products.
     */
    public void printAllProducts()
    {
        inputManager.printList();
        firstInput = false;
    }
}