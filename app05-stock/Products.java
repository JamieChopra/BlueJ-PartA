
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
        stock -= myStock;
        return stock;
    }

}
