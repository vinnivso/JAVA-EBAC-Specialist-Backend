public class FirstFibonacci {
    private static final int maxx = 100;
    private static final long[]listFibo = new long[maxx];
    /**
     * Calculates the nth Fibonacci number.
     *
     * @param n the index of the Fibonacci number to find
     * @return the nth Fibonacci number
     */
    public static int FindFibo(int n){
        // Base case
        if (n <= 1){
            return n;
        }
        // Recursive case
        return FindFibo(n - 1) + FindFibo(n - 2);
    }

    /**
     * Calculates the nth Fibonacci number
     * @param args the index of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static void main(String[] args){
        int n = 4;
        System.out.println(FindFibo(n));
    }
}
