import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        // Variables
        double price;
        double TAX = .05;
        double total;

        // price input and caculation of tax and total
        System.out.println("What is the price of your purchase?");
        price = scan.nextDouble();
        total = price + (price * TAX);
        System.out.println("Your total cost will be $" + total);
    }
}
