import java.sql.SQLOutput;
import java.util.ArrayList;

public class Manager
{
    Products myProduct = new Products();

    ArrayList<Products> productList= new ArrayList<Products>();

    /**
     *Adds products to end of arraylist (requires user input of name and id)
     */
    public ArrayList<Products> addNewProduct(String newName, int thisID)
    {
        productList.add(new Products());
        productList.get(productList.size()- 1).setName(newName);
        productList.get(productList.size()- 1).setID(thisID);
        return productList;
    }

    /**
     *Goes through list and searches for product and removes it based on id.
     */
    public ArrayList<Products> removeProduct(int removeID)
    {
        int count = 0;
        boolean a = false;
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).id == removeID)
            {
                productList.remove(i);
                i--;
                a = true;
                count++;
            }
        }
            if(!a)
            {
                System.out.println("The item you are attempting to remove does not exist on the list.");
            }
            else
                {
                    System.out.println(removeID + " has been removed " + count + " times");
                }
        return productList;
    }

    /**
     * Gets user input and stores it as a string then searches the list to see what items contain
     * the string and prints them.
     */
    public ArrayList<Products> searchProduct(String searchName)
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).name.contains(searchName))
            {
                System.out.println(productList.get(i).name + " " + productList.get(i).id);
            }
        }
        return productList;
    }

    /**
     * Goes through the list and prints products name, id and stock.
     */
    public void printList()
    {
        for(int i = 0; i < productList.size(); i++)
        {
            System.out.println(productList.get(i).name + ", " + productList.get(i).id + ", " + productList.get(i).stock);
        }
    }

    /**
     *  User can input an amount they wish to deliver and the id.
     */
    public ArrayList<Products> deliverStock(int deliverID, int deliverAmount)
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(deliverAmount > 0) {
                if (productList.get(i).id == deliverID) {
                    productList.get(i).deliverStock(deliverAmount);
                    System.out.println("You have delivered this amount: " + deliverAmount + " of " + productList.get(i).name);
                }
            }
            else
                {
                    System.out.println("You have not entered a valid value.");
                }
        }
        return productList;
    }

    /**
     *  User can input an amount of stock they wish to sell for a certain id.
     */
    public ArrayList<Products> sellStock(int sellID, int sellAmount)
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).id == sellID)
            {
                productList.get(i).sellStock(sellAmount);
            }
        }
        return productList;
    }

    /**
     *  Prints all products with a stock number of less than 4.
     */
    public ArrayList<Products> lowStock()
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).stock < 4)
            {
                System.out.println(productList.get(i).name + ", " + productList.get(i).id + ", " + productList.get(i).stock);
            }
        }
        return productList;
    }

    /**
     *  Restocks all products in a list to 10.
     */
    public ArrayList<Products> reStock()
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).stock < 4)
            {
                productList.get(i).stock = 10;
            }
        }
        return productList;
    }

    /**
     *  Method for creating the default product list.
     */
    public ArrayList<Products> defaultList()
    {
        productList.add(new Products());
        productList.get(0).setID(100);
        productList.get(0).setName("Bread");
        productList.add(new Products());
        productList.get(1).setID(101);
        productList.get(1).setName("Apple");
        productList.add(new Products());
        productList.get(2).setID(102);
        productList.get(2).setName("Orange");
        productList.add(new Products());
        productList.get(3).setID(103);
        productList.get(3).setName("Beetroot");
        productList.add(new Products());
        productList.get(4).setID(104);
        productList.get(4).setName("Pear");
        productList.add(new Products());
        productList.get(5).setID(105);
        productList.get(5).setName("Raspberry");

        return productList;
    }
}

