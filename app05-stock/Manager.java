import java.sql.SQLOutput;
import java.util.ArrayList;

public class Manager
{
    Products myProduct = new Products();

    ArrayList<Products> productList= new ArrayList<Products>();

    public ArrayList<Products> addNewProduct(String newName, int thisID)
    {
        productList.add(new Products());
        productList.get(productList.size()- 1).setName(newName);
        productList.get(productList.size()- 1).setID(thisID);
        return productList;
    }

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

    public void printList()
    {
        for(int i = 0; i < productList.size(); i++)
        {
            System.out.println(productList.get(i).name + ", " + productList.get(i).id);
        }
    }

    public ArrayList<Products> deliverStock()
    {
        
    }

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

