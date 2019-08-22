package adri.products;

//import com.company.com.products.Product;

public class Electronics extends Product
{
    public Electronics(String membersName, double membersPrice)
    {
        super(membersName, membersPrice);
        Product electronics = new Electronics(membersName, membersPrice);
        electronics.toString();
    }


    private void assertEquals(String book, String simpleName)
    {
    }
    @Override
    public String toString(){
        return getClass().getSimpleName()+membersName+membersPrice;
    }
}
