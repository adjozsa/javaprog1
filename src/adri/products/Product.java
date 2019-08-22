package adri.products;

public abstract class Product
{
    public String membersName;
    public double membersPrice;


    public Product(String membersName, double membersPrice)
    {
        membersName = this.membersName;
        membersPrice = this.membersPrice;
        try
        {
            if (membersPrice < 0)
            {
                System.out.println("Negative number alert!");

            }
        } catch (Exception e)
        {
            System.out.println("Something went wrong");
        } finally
        {
            System.out.println("Examination finished.");
        }

    }

    @Override
    public String toString()
    {

        return "You never should see this!";
    }

}
