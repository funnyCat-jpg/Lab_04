import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        double winterMaint;
        double springMaint;
        double summerMaint;
        double fallMaint;
        double total;

        //Asking for maintenance  costs for ect season
        System.out.println("What is the maintenance cost for winter?");
        winterMaint = scan.nextDouble();
        System.out.println("What is the maintenance cost for spring?");
        springMaint = scan.nextDouble();
        System.out.println("What is the maintenance cost for summer?");
        summerMaint = scan.nextDouble();
        System.out.println("What is the maintenance cost for fall?");
        fallMaint = scan.nextDouble();

        System.out.println();

        // Calcultes maintenance cost for whole year
        total = winterMaint + springMaint + summerMaint + fallMaint;

        // Output total
        System.out.println("The total maintenance cost for the whole year will be $" + total);
    }
}
