public class Task1 {
    public static void main(String[] args) {
        // Variables
        int intOperandA = 6;
        int intOperandB = 4;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        double doubleOperandA = 8.2 ;
        double doubleOperandB = 4.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        // ints sums, diffrences, products, quotents, and modulo's
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " +  intModulo);

        System.out.println();

        // doubles sums, diffrences, products, quotents, and modulo's
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " +  doubleModulo);
    }
}
