import java.util.Arrays;
import java.util.Scanner;

public class Foodmachine {

    public static void main(String[] args) {
        Product pr = new Product();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String inputString = scanner.nextLine();

        if (inputString.equals("on")) {
            pr.loadProduct();

            System.out.print("Выберите продукт: ");
            int numButton = scanner.nextInt();

            Buttons button = new Buttons();
            button.checkPutButton(numButton);
            
        } else {
            System.out.println("Запустите аппарат");
        }


    }
}