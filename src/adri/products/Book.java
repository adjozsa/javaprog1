package adri.products;

//import com.company.com.products.Product;

public class Book extends Product
{
    public String getAuthorMember()
    {
        return authorMember;
    }

    public void setAuthorMember(String authorMember)
    {
        this.authorMember = authorMember;
        authorMember = ("noAuthor");
    }

    String authorMember;

    Book(String membersName, double membersPrice, String authorMember)
    {
        super(membersName, membersPrice);
    }

    @Override
    public String toString()
    {
//        System.out.println(String.format(membersName + membersPrice + authorMember));
//        assertEquals("Book", Book.class.getSimpleName());
        return String.format(getClass().getSimpleName()+ super.membersName + super.membersPrice + authorMember);
    }

    private void assertEquals(String book, String simpleName)
    {
    }

}


