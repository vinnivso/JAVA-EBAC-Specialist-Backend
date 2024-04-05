import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Integer> pilha;

    public Pilha() {
        pilha = new ArrayList<>();
    }

    /**
     * Add an element to the stack.
     *
     * @param n the integer to be added to the stack
     */
    public void push(int n){
        pilha.add(n);
    }

    /**
     * Calculates the size of the 'pilha' list.
     *
     * @return The size of the list 'pilha'.
     */
    public int size() {
        int size = 0;
        for (Integer z : pilha) {
            size++;
        }
        return size;
    }

    /**
     * Removes and returns the top element from the stack.
     * @return the top element of the stack
     */
    public int pop() {
        // Get the index of the top element
        int topIndex = size() - 1;

        // Get the top element
        int top = pilha.get(topIndex);

        // Remove the top element
        pilha.remove(topIndex);

        // Return the top element
        return top;
    }

    /**
     * Returns the top element of the stack.
     * @return the top element of the stack
     */
    public int top() {
        // Get the index of the top element
        int topIndex = size() - 1;
        // Get the top element from the stack
        int top = pilha.get(topIndex);
        return top;
    }

    /**
     * Checks if the collection is empty and prints a message accordingly.
     */
    public void isEmpty() {
        if (size() == 0) {
            System.out.println("The collection is empty!");
        } else {
            System.out.println("The collection is not empty");
        }
    }
}
