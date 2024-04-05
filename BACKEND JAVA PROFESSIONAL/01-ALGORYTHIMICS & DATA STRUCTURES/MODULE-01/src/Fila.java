import java.util.ArrayList;
import java.util.List;

public class Fila {
    private List<Integer> fila;

    public Fila() {
        fila = new ArrayList<>();
    }

    /**
     * Adds an element to the queue.
     *
     * @param n the element to add to the queue
     */
    public void enqueue(int n) {
        fila.add(n);
    }

    /**
     * Removes and returns the first element from the queue.
     * @return the value of the removed element
     */
    public int denqueue() {
        // get the first element from the queue
        int deq = fila.get(0);

        // remove the first element from the queue
        fila.remove(0);

        // return the removed element
        return deq;
    }

    /**
     * Returns the size of the queue.
     * @return the size of the queue
     */
    public int size(){
        int size = 0;
        for (Integer z : fila) {
            size++;
        }
        return size;
    }

    /**
     * Returns the element at the rear of the queue.
     *
     * @return the element at the rear of the queue
     */
    public int rear() {
        // Calculate the index of the top element
        int topIndex = size() - 1;

        // Retrieve the top element from the queue
        int top = fila.get(topIndex);

        return top;
    }

    /**
     * Retrieves and returns the element at the front of the queue.
     *
     * @return the element at the front of the queue
     */
    public int front() {
        int top = fila.get(0);
        return top;
    }

    /**
     * Checks if the queue is empty and prints a corresponding message.
     */
    public void isEmpty() {
        if (size() == 0) {
            System.out.println("The queue is empty!");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}
