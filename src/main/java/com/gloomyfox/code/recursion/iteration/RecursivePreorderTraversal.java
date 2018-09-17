package com.gloomyfox.code.recursion.iteration;

import com.gloomyfox.structure.Node;

import java.util.ArrayList;
import java.util.List;

public class RecursivePreorderTraversal implements PreorderTraversal {

    @Override
    public List<Integer> traverse(Node node) {
        List<Integer> order = new ArrayList<>();
        traverse(node, order);
        return order;
    }

    private void traverse(Node node, List<Integer> order) {
        order.add(node.getValue());

        if(node.getLeft() != null) {
            traverse(node.getLeft(), order);
        }

        if(node.getRight() != null) {
            traverse(node.getRight(), order);
        }
    }
}
