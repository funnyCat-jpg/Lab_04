import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        double f;
        double c;

        //ask user for temp and conversion
        System.out.println("What is the temperature? (In fahrenheit)");
        f = scan.nextDouble();
        c = (f - 32)*5/9;

        System.out.println();

        System.out.println("The temperature " + f + " in fahrenheit, converted to celsius is " + c);
    }
}
