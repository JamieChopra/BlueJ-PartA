import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * Jamie Chopra
 * 0.1
 */
public class Ticket
{
    //Attributes
    
    //This is the destination of the journey
    private String destination;
    
    //This is the cost of the ticket in pence.
    private int price;
    
    //This is the date of the ticket purchase.
    private Date dateTime = new Date();
    
    /**
     * Constructor for objects of class Ticket
     * 
     */
    public Ticket()
    {
        price = 220;
        destination = "Aylesbury";
    }
    
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
    }
    
    public void getPrice()
    {
        this.price = price;
    }
    
    /**
     * String to return the destination of the tickets.
     * 
     */
    public String getDestination()
    {
        return destination;
    }
    
  
    /**
     * Constructor for printing the destination, date and price.
     */
    public void print()
    {
        System.out.println("Ticket to " + destination);
        System.out.println("Cost of ticket " + price + "p ");
        System.out.println("Issued at " + dateTime);
    }
}
