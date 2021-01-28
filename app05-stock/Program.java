
/**
 * Contains main method to run application.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Program
{
    private static StockApp app;
    /**
     *      * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main(String[]args)
    {
        app = new StockApp();
        app.input.inputManager.defaultList();
        app.run();
    }
}
