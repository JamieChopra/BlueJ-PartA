import java.util.ArrayList;

public class Manager
{
    Products myProduct = new Products();

    ArrayList<Products> productList= new ArrayList<Products>();

    public Manager()
    {

    }

    public ArrayList<Products> addNewProduct(String newName)
    {
        productList.add(new Products());
        productList.get(productList.size()- 1).setName(newName);
        return productList;
    }

    public ArrayList<Products> removeProduct(String removeName)
    {
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).equals(removeName));
        }
        return productList;
    }

    public void printList()
    {
        for(int i = 0; i < productList.size(); i++)
        {
            System.out.println(productList.get(i));
        }
    }

}

