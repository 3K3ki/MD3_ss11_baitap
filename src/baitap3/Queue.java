package baitap3;

public class Queue {
    private Node front;
    private Node near;

    public Queue(Node front, Node near) {
        this.front = null;
        this.near = null;
    }

    public Queue() {

    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", near=" + near +
                '}';
    }
}
