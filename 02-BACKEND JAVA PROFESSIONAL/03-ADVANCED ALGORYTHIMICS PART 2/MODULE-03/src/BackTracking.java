public class BackTracking {
    /**
     * Calculates all possible subsets of size n from the given array s
     * @param s The input array
     * @param n The size of the subsets
     * @param start The starting index
     * @param currentSubset The current subset being constructed
     * @param currentSize The current size of the subset
     */
    private static void calcularSubconjuntos(int[] s, int n, int start, int[] currentSubset, int currentSize) {
        if (currentSize == n) {
            imprimir(currentSubset); // Print the subset when it reaches the desired size
            return;
        }

        for (int i = start; i < s.length; i++) {
            currentSubset[currentSize] = s[i]; // Include the element in the subset
            calcularSubconjuntos(s, n, i + 1, currentSubset, currentSize + 1); // Recursively calculate subsets
            currentSubset[currentSize] = 0; // Clear the element for backtracking
        }
    }


    /**
     * Print the elements of the given array
     *
     * @param subconjunto the array to be printed
     */
    private static void imprimir(int[] subconjunto) {
        for (int elemento : subconjunto) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    /**
     * Main function to calculate subsets of an array.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Number of elements in the subset
        int n = 2;
        // Original array
        int[] s = {1, 2, 3};

        // Initialize subset array
        int[] subconjuntoAtual = new int[n];

        // Calculate subsets recursively
        calcularSubconjuntos(s, n, 0, subconjuntoAtual, 0);
    }
}
