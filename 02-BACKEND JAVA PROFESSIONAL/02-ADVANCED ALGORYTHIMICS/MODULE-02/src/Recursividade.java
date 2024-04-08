public class Recursividade {
    /**
     * Recursive function to calculate the factorial of a number.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of the given number
     */
    public static long Fatorial(long n){
        if (n <= 1){
            return n;
        }
        return Fatorial(n - 1) * n;
    }

    /**
     * This function calculates the factorial of a given number.
     *
     * @param args The number to calculate the factorial of
     * @return The factorial of the input number
     */
    public static void main(String[] args) {
        Integer n = 20;
        System.out.println("Fatorial de n é: "+ Fatorial(n));
    }
}
