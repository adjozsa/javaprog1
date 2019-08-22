package adri;

//import com.company.com.products.Product;

import adri.orders.Order;
import adri.orders.OrderItem;
import adri.products.Food;
import adri.products.Product;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Product product = new Food("bread", 1);
        OrderItem orderItem = new OrderItem("orange", 2, 3,5);
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(orderItem);
        Order order = new Order(arrayList);
        order.addItem(product, 2);
        System.out.println(product);

    }
}
