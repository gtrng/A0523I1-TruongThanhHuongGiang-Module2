package ss9_ArrayList.MyLinkedList;

import java.util.LinkedList;
public class Node<E> {
    Node<E> next;

    E data;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }
}
