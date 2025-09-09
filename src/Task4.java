public class Task4 {
    public static void main(String[] args) {
        // Variables
        int cardBalance = 5000;
        double INTREST = .17;
        double total;

        // total caluclations and outputs
        total = cardBalance + (cardBalance * INTREST);
        System.out.println("The total balance of the credit card, after one month, will be $" + total + " including intrest");
        System.out.println();
        total += cardBalance + (cardBalance * INTREST);
        System.out.println("The total balance of the credit card, after two months, will be $" + total + " including intrest");
    }
}
