package model;


import lombok.Data;

@Data

public class Node {
    public Node(Kid data) {
        this.data = data;
    }

    private Kid data;
    private Node next;

}
