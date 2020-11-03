import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    //Attributes
    
    //This is the destination of the journey
    private String destination;
    
    //This is the cost of the ticket in pence.
    private int price;
    
    //This is the date of the ticket purchase.
    private Date dateTime;
    
    /**
     * Constructor for objects of class Ticket
     * 
     */
    public Ticket(String destination, int price)
    {
        dateTime = new Date();
        this.destination = destination;
        this.price = price;
    }

    /**
     * Constructor for printing the destination, date and price.
     */
    public void print()
    {
        System.out.println(destination);
        System.out.println(price);
        System.out.println(dateTime);
    }
}
