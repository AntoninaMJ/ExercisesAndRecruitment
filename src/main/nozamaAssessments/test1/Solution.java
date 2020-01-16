//input:
// head1 = 1->2->3->4
// head2 = 1->3->5->7
//output:
// 1->1->2->3->3->5->7

package main.nozamaAssessments.test1;

public class Solution {
    public static void main(String[] args) {

        Node node1 = Node.toDoNode(1, 2, 3, 4);
        Node node2 = Node.toDoNode(1, 3, 5, 7);

        System.out.println(Node.mergeLists(node1, node2));
    }
}

/*
1st way
Node head1 = new Node(1, new Node(2, new Node(3, new Node(4))));

2nd way
Node node1 = new Node(7);
Node node2 = new Node(5);
node2.next = node1;
Node node3 = new Node(3);
node3.next = node2;
Node head2 = new Node(1);
head2.next = node3;
 */