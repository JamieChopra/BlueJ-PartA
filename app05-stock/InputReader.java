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
        takeInput(inputLine);
        return inputLine;
    }

    public String takeInput(String takingInput)
    {


        if(takingInput == "Quit")
        {
            quitProgram();
        }
        else if(takingInput == "Add"){
            addProduct();
        }
        else if(takingInput == "Remove")
        {
            printAllProducts();
        }
        else if()
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