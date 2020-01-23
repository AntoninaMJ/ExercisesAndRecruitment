package main.recruitmentTestsNozama.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Node {
    private int data;
    private Node next;

    public Node() {
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public static Node toDoNode(Integer... values) {
        if(values.length == 0) {
            return null;
        }
        return toDoNode(new ArrayList<>(Arrays.asList(values)));
    }

    public static Node toDoNode(List<Integer> list) {
        Node node = new Node();
        node.data = list.get(0);
        list.remove(0);
        if (!list.isEmpty()) {
            node.next = toDoNode(list);
        }
        return node;
    }

    public static Node mergeLists(Node node1, Node node2){
        Node node = new Node();
        if (node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        if (node1.data < node2.data){
            node.data = node1.data;
            node.next = mergeLists(node1.next, node2);
        } else {
            node.data = node2.data;
            node.next = mergeLists(node1, node2.next);
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
