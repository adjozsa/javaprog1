package adri.orders;

public class OrderItem
{
    String name;
    double price;
    double quantity;
    double discount;
    double ammount;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public OrderItem(String name, double price, double quantity, double ammount)
    {
        name = this.name;
        price = this.price;
        quantity = this.quantity;
        System.out.println(name + price + quantity);
    }

    public void recalculateAmount()
    {
        double amount = (quantity * price) - discount;
    }

    @Override
    public String toString()
    {
        return String.format(getClass().getSimpleName()+ name, price, quantity,ammount, discount);
    }
}
