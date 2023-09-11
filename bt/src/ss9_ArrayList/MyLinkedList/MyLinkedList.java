package ss9_ArrayList.MyLinkedList;

public class MyLinkedList<E> {
    Node<E> head;
    private int numNodes = 0;

    public MyLinkedList() {
        this.head = null;
    }

    public void addFirst( E data){
        Node<E> t = new Node<>(data);
        if(this.head == null){
            head = t;
        } else {
            Node<E> x = head;
            while(x.next != null){
                x = x.next;
            }
            x.next = t;
        }
        numNodes++;
    }

    public void add(int index, E data){
        if(index > numNodes + 1){
            System.out.println("unavailable!");
            return;
        }
        if(index == 1){
            Node<E> t = head;
            head = new Node<>(data);
            head.next = t;
            return;
        }
        Node<E> t = head;
        Node<E> prev = new Node<>(null);
        while (index -1 > 0){
            prev = t;
            t = t.next;
            index--;
        }
    }

}
