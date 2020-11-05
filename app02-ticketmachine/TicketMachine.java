/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Jamie Chopra
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket aylesburyTicket;
    private Ticket amershamTicket;
    private Ticket highWycombeTicket;
    /**
     * Create a machine that issues tickets of the given price.
      */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        createTickets();
    }
    /**
     * Method that stores the three tickets
     */
    private void createTickets()
    {
        aylesburyTicket = new Ticket ("Aylesbury", 220);
        amershamTicket = new Ticket ("Amersham", 300);
        highWycombeTicket = new Ticket ("HighWycombe",330);
    }
    
    /**
     * Heading for clear presentation in the terminal when printing available tickets.
     *
     */
    private void printHeading()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("##################");
    }
    
    /**
     * Prints all tickets available.
     */
    public void printAllTickets()
    {
       printHeading();
       System.out.println();
       aylesburyTicket.print();
       System.out.println();
       amershamTicket.print();
       System.out.println();
       highWycombeTicket.print();
       System.out.println();
    }
  
    
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    /**
     * Method for the purchase of the Aylesbury ticket in which buys the ticket if the balance is
     * above or equal to the price of the ticket and prints the remaining balance. 
     * 
     * If the balance is below the price of the ticket a message is given stating that there are 
     * not sufficient funds for the purchase of the ticket and the required amount to insert in
     * order to purchase the ticket is presented.
     */
    public void buyAylesburyTicket()
    {
       if (balance >= 220)
       {   System.out.println();
           balance = balance - 220;
           System.out.println("You have purchased a ticket to Aylesbury");
           System.out.println("Remaining balance = " + (balance) + " pence" );
       }
       else
       {    
           System.out.println();
           System.out.println("You do not have sufficient funds to purchase a ticket to Aylesbury");
           System.out.println("You require = " + (220 - balance) + " pence more in order to purchase this ticket to Aylesbury");
       }
    }
    
    /**
     * Method for the purchase of the Amersham ticket.
     */
    public void buyAmershamTicket()
    {
       if (balance >= 300)
       {   System.out.println();
           balance = balance - 300;
           System.out.println("You have purchased a ticket to Amersham");
           System.out.println("Remaining balance = " + (balance) + " pence" );
       }
       else
       {    
           System.out.println();
           System.out.println("You do not have sufficient funds to purchase a ticket to Amersham");
           System.out.println("You require = " + (300 - balance) + " pence more in order to purchase this ticket to Amersham");
       }
    }
    
    /**
     * Method for the purchase of the HighWycombe ticket.
     */
    public void buyHighWycombeTicket()
    {
       if (balance >= 330)
       {   System.out.println();
           balance = balance - 330;
           System.out.println("You have purchased a ticket to High Wycombe");
           System.out.println("Remaining balance = " + (balance) + " pence" );
       }
       else
       {    
           System.out.println();
           System.out.println("You do not have sufficient funds to purchase a ticket to High Wycombe");
           System.out.println("You require = " + (330 - balance) + " pence more in order to purchase this ticket to High Wycombe");
       }
    }
    
    /**
     * Inserting money into ticket machine
     */
  
    public void insert20p()
    {
        balance = balance + 20;
        printBalance(20);
    }
    
    public void insert10p()
    {
        balance = balance + 10;
        printBalance(10);
    }
    
    public void insert100p()
    {
        balance = balance + 100;
        printBalance(100);
    }
    
    public void insert200p()
    {
        balance = balance + 200;
        printBalance(200);
    }
    
    /**
     * 
     */
    public void printBalance(int amount)
    {
        System.out.println("You Have Inserted: " + amount + "p");
        System.out.println("Current Balance= " + balance + "p");
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        System.out.println("Your balance has been refunded.");
        System.out.println();
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        System.out.println("Remaining balance= " + balance);
        return amountToRefund;
        
    }
 
}
