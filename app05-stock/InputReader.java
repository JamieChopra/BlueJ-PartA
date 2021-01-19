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

    public boolean takeInput(String takingInput)
    {

        if(takingInput == "Quit")
        {
            quitProgram();
            firstInput = true;
        }
        else if(takingInput == "Add"){
            addProduct();
            firstInput = true;
        }
        else if(takingInput == "Remove")
        {
            printAllProducts();
            firstInput = true;
        }
        else
            {
                firstInput = false;
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
        if(getInput() == "Add")
        {

        }
    }

    public void printAllProducts()
    {

    }
}