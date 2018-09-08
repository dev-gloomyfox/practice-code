package com.gloomyfox.code.recursion.iteration;

import com.gloomyfox.structure.Node;

import java.util.ArrayList;
import java.util.List;

public class IterativeInorderTraversal implements InorderTraversal {

    @Override
    public List<Integer> traverse(Node node) {
        List<Integer> order = new ArrayList<>();

        List<Node> stack = new ArrayList<>();
        stack.add(node);

        while (!stack.isEmpty()) {
            Node target = stack.get(stack.size() - 1);

            order.add(target.getValue());
            stack.remove(stack.size() - 1);

            if(target.getRight() != null) {
                stack.add(target.getRight());
            }

            if(target.getLeft() != null) {
                stack.add(target.getLeft());
            }
        }

        return order;
    }
}
