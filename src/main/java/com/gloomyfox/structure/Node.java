package com.gloomyfox.structure;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public Node getRight() {
        return right;
    }
}
