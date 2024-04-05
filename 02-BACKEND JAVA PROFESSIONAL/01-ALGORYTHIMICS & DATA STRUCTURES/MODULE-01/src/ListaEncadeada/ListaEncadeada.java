package ListaEncadeada;

public class ListaEncadeada {
    private Node head;

    public ListaEncadeada(){
        this.head = null;
    }

    /**
     * Adds a node to the end of the linked list.
     *
     * @param node The node to be added
     */
    public void push(Node node) {
        if (head == null) { // If the list is empty, make the new node the head
            head = node;
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = node; // Add the new node to the end
        }
    }

    /**
     * Removes and returns the last node in the linked list.
     * If the list is empty, returns null.
     *
     * @return the removed node or null if the list is empty
     */
    public Node pop() {
        if (head == null) { // If the list is empty
            return null;
        } else if (head.next == null) { // If there is only one node in the list
            Node node = head;
            head = null;
            return node;
        } else { // Traverse the list to find the last node
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            Node node = current.next;
            current.next = null;
            return node;
        }
    }

    /**
     * Inserts a node at the specified index in the linked list.
     * If index is 0, the node is inserted at the beginning of the list.
     *
     * @param index the index at which the node should be inserted
     * @param node the node to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void insert(int index, Node node) {
        // If index is 0, insert node at the beginning
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            // Traverse the list to the node before the specified index
            for (int i = 0; i < index - 1; i++) {
                if (current.next != null) {
                    current = current.next;
                } else {
                    throw new IndexOutOfBoundsException("Index out of range");
                }
            }
            // Insert the node at the specified index
            node.next = current.next;
            current.next = node;
        }
    }

    /**
     * Removes the node at the specified index.
     * If the index is out of range, throws IndexOutOfBoundsException.
     *
     * @param index the index of the node to be removed
     */
    public void remove(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next; // If index is 0, update head to the next node
            } else {
                throw new IndexOutOfBoundsException("Index out of range");
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current.next != null) {
                    current = current.next;
                } else {
                    throw new IndexOutOfBoundsException("Index out of range");
                }
            }
            if (current.next != null) {
                current.next = current.next.next; // Update the next reference of the current node
            } else {
                throw new IndexOutOfBoundsException("Index out of range");
            }
        }
    }

    /**
     * Returns the node at the specified index.
     *
     * @param index the index of the node to return
     * @return the node at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Node elementAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current != null) {
                current = current.next;
            } else {
                throw new IndexOutOfBoundsException("Index out of range");
            }
        }
        if (current != null) {
            return current;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    /**
     * Returns the number of elements in the linked list.
     */
    public int size() {
        // Initialize count to 0
        int count = 0;
        // Start at the head of the list
        Node current = head;
        // Iterate through the list and count the elements
        while (current != null) {
            count++;
            current = current.next;
        }
        // Return the count
        return count;
    }

    /**
     * Prints the elements of the linked list.
     */
    public void printList() {
        Node current = head;
        StringBuilder sb = new StringBuilder();

        // Build the string representation of the linked list
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }

        // Remove the last arrow if the list is not empty
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 4);
        }

        // Print the linked list
        System.out.println(sb.toString());
    }
}
