import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class InputReader {
    private Scanner reader;
    boolean firstInput = false;
    StockManager stockInput;

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
            quitProgram();
            firstInput = true;

        }
        else if(takingInput.equals("Add")){
            addProduct();
            firstInput = true;
        }
        else if(takingInput.equals("Remove"))
        {
            printAllProducts();
            firstInput = true;
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
    }

    public void addProduct()
    {


    }

    public void printAllProducts()
    {

    }
}