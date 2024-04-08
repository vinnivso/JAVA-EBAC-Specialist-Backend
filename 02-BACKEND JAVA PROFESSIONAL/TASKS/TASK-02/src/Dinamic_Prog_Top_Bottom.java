public class Dinamic_Prog_Top_Bottom {
    private static final int maximo = 100;
    private static final long[] listaFac = new long[maximo];

    /**
     * Calculates the factorial of a given number n.
     *
     * @param n The number for which to calculate the factorial.
     * @return The factorial of the input number n.
     */
    public static long DinFac(int n) {
        // Initialize the list with -1 values
        for (int i = 0; i < maximo; i++) {
            listaFac[i] = -1;
        }
        // Return the factorial of n
        return Fatorial(n);
    }

    /**
     * Calculates the factorial of a given number.
     * @param n the number to calculate the factorial for
     * @return the factorial of the given number
     */
    public static long Fatorial(int n) {
        // Complexity O(n) - needs to iterate through all values from N to 1
        if (listaFac[n] == -1) {
            if (n <= 1) {
                listaFac[n] = n;
            } else {
                listaFac[n] = Fatorial(n - 1) * n;
            }
        }
        return listaFac[n];
    }

    /**
     * Main method to calculate and print the factorial of a number.
     *
     * @param args The input arguments from the command line.
     */
    public static void main(String[] args) {
        int n = 20; // Define the number for which the factorial will be calculated
        System.out.println("Factorial of n is: " + DinFac(n)); // Print the factorial of n
    }
}
