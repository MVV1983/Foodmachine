import java.util.Arrays;

public class Buttons {
    Integer[] buttons = new Integer[]{0, 1, 2};


    public void checkPutButton(Integer num) {
        Product pr = new Product();
        pr.loadProduct();
        String prodName;

        switch (num) {
            case 0:
                prodName = pr.productAndPrice.get(100);
                System.out.println(Arrays.asList(pr.productAndPrice.get(100)));
                takeFood(prodName);
                break;
            case 1:
                prodName = pr.productAndPrice.get(75);
                System.out.println(Arrays.asList(pr.productAndPrice.get(75)));
                takeFood(prodName);
                break;
        }
    }

    public void takeFood(String prodName) {
        Product pr = new Product();
        pr.loadProduct();
        System.out.println("Возьмите ваш " + prodName);
    }
}
