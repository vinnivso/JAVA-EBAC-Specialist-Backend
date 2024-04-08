public class SecondFibonacci {
    private static final int maxx = 100;
    private static final long[]listFibo = new long[maxx];

    /**
     * Calculates the Fibonacci number using memoization for optimization.
     *
     * @param n The index of the Fibonacci number to find
     * @return The Fibonacci number at index n
     */
    public static long DinFac(int n) {
        // Initialize the list with -1 to mark all positions as not calculated yet
        for (int i = 0; i < maxx; i++) {
            listFibo[i] = -1;
        }
        // Find the Fibonacci number at index n using memoization
        return FindFibo(n);
    }


    /**
     * Returns the nth Fibonacci number.
     *
     * @param n the index of the Fibonacci number to find
     * @return the Fibonacci number at index n
     */
    public static long FindFibo(int n){
        if (listFibo[n] == -1){
            if (n <= 1){
                listFibo[n] = n;
            } else
                listFibo[n] = FindFibo(n - 1) + FindFibo(n - 2);
        }
        return listFibo[n];
    }

    /**
     * This function calculates the factorial of a given number.
     * @param args the number for which factorial needs to be calculated
     * @return the factorial of the input number
     */
    public static void main(String[] args){
        int n = 50;
        System.out.println(DinFac(n));
    }
}
