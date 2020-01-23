package test.java.nozamaAssesments.test1;


import static org.junit.Assert.*;

import main.nozamaAssessments.test1.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NodeTest {

    //1st way
    Node expectedMerge = new Node(1, new Node(1, new Node(2,
            new Node(3, new Node(3, new Node(4, new Node(5, new Node(7))))))));

    Node expectedHead1 = new Node(1, new Node(2, new Node(3, new Node(4))));

    //2nd way
    Node node1 = new Node(7);
    Node node2 = new Node(5, node1);
    Node node3 = new Node(3, node2);
    Node expectedHead2 = new Node(1, node3);

    @Test
    public void checkToDoNode() {
        Node mergeIntegers = Node.toDoNode(1, 1, 2, 3, 3, 4, 5, 7);
        assertEquals(expectedMerge, mergeIntegers);
        Node mergeEmpty = Node.toDoNode();
        assertNull(mergeEmpty);
        Node mergeList = Node.toDoNode(new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 7)));
        assertEquals(expectedMerge, mergeList);
    }

    @Test
    public void checkMergeList() {
        assertEquals(expectedMerge, Node.mergeLists(expectedHead1, expectedHead2));
    }

}