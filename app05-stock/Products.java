
public class Products
{
    int id = 0;
    String name;
    int stock = 0;

    public String setName(String newName)
    {
        name = newName;
        return name;
    }

    public int setID(int newID)
    {
        id = newID;
        return id;
    }

    public int deliverStock(int newStock)
    {
        stock += newStock;
        return stock;
    }

    public int sellStock(int myStock)
    {
        if(stock - myStock < 0)
        {
            int overflowStock = myStock - stock;
            stock = 0;
            System.out.println("You have sold all of your stock, you do not have sufficient stock to sell: " + overflowStock + " more stock");
        }
        else
        {
            stock -= myStock;
            System.out.println("You have sold this amount of stock: " + myStock);
            System.out.println("You have: " + stock + " stock left.");
        }
        return stock;
    }

}
