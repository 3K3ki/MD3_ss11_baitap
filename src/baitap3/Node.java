package baitap3;

public class Node<E> {
    private int data;
    private Node link;

    public Node(int data, Node link) {
        this.data = data;
        this.link = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }
}
