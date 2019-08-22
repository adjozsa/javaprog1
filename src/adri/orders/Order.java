package adri.orders;

import adri.products.Food;
import adri.products.Product;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Order


{

    private ArrayList<OrderItem> orders;

    public Order(ArrayList<OrderItem> orders)
    {
        this.orders = orders;
        addItem(new Food("bread", 1), 1.d);
    }

//    {
//        ArrayList<OrderItem> orders;
//        addItem("product",1.0d);
//    }

    public void addItem(Product product, double quantity)
    {
        if (product == null)
        {
            throw new NullPointerException("Product should not be null");
        }
        if (quantity < 0)
        {
            throw new NullPointerException("Number should not be negative");
        }
    }

    private boolean deleteItem(@NotNull String name)
    {
        System.out.println("Which product would you like to delete ? Please give it's name");
        productScanner();
        if (name.equals(productScanner()))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public String productScanner()
    {
        Scanner productScanner = new Scanner(System.in);
        return productScanner.nextLine();
    }

    private double calculateOrderTotal()
    {
        //hogy adom vissza a megrendelt szummát mi a szumma rendelt item ?
        double totalPrice = 0;
        for (int i = 0; i < orders.size(); i++)
        {
            totalPrice += orders.get(i).getPrice();
        }
        return totalPrice;
    }

    private void printItem()
    {
        System.out.println();
    }
}
