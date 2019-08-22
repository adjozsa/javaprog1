package adri.products;

//import com.company.com.products.Product;

import java.util.Calendar;
import java.util.Date;



public class Food extends Product
{
    public Food(String membersName, double membersPrice) {
        super(membersName, membersPrice);
        getShelfDate().setTime(getCurrentDate());
        getShelfDate().add(Calendar.DATE,5);
    }

    public Food(String membersName, double membersPrice, Calendar shelfDate)
    {
        super(membersName, membersPrice );
        this.shelfDate = shelfDate;
    }

    private Date currentDate = new Date();

    public Calendar getShelfDate()
    {
        return shelfDate;
    }

    public void setShelfDate(Calendar shelfDate)
    {
        this.shelfDate = shelfDate;
    }

    private Calendar shelfDate = Calendar.getInstance();


    public Date getCurrentDate()
    {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate)
    {
        this.currentDate = currentDate;
    }
    @Override
    public String toString(){

    return getClass().getSimpleName()+ membersName + membersPrice +shelfDate;}
}
