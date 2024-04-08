public class Calculadora {

    /**
     * This function calculates the sum of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The sum of the two integers
     */
    public static int sum(int a, int b){
        return a + b;
    }


    /**
     * Subtracts two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The result of subtracting b from a
     */
    public static int sub(int a, int b){
        return a - b;
    }


    /**
     * This function multiplies two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The result of multiplying a and b
     */
    public static int mul(int a, int b){
        return a * b;
    }


    /**
     * This function divides two integers.
     *
     * @param a The dividend
     * @param b The divisor
     * @return The result of the division, or 0 if the divisor is 0
     */
    public static int div(int a, int b){
        if (b == 0){
            return 0; // Return 0 if the divisor is 0
        } else {
            return a / b; // Return the result of the division
        }
    }
}
