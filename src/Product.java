import java.util.HashMap;
import java.util.Scanner;

public class Product {
    private String nameProduct = "";
    private double price;
    HashMap<Integer, String> productAndPrice = new HashMap<>();


    public HashMap<Integer, String> getProductAndPrice() {
        return productAndPrice;
    }


    public void loadProduct() {
        productAndPrice.put(100, "snikers");
        productAndPrice.put(75, "mars");
    }
}
