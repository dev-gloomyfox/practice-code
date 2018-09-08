package com.gloomyfox.code.recursion.iteration;

import com.gloomyfox.structure.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InorderTraversalTests {

    private static final Node TEST_NODE = new Node(1,
            new Node(2,
                    new Node(4,
                            new Node(6, null, null),
                            null),
                    new Node(5, null, null)),
            new Node(3, null, null));;

    private static final List<Integer> EXPECTED_LIST =
            Collections.unmodifiableList(Arrays.asList(1, 2, 4, 6, 5, 3));

    @Test
    public void recursivePreorderTest() {
        InorderTraversal traversal = new RecursiveInorderTraversal();
        Assert.assertEquals(EXPECTED_LIST, traversal.traverse(TEST_NODE));
    }

    @Test
    public void iterativePreorderTest() {
        InorderTraversal traversal = new IterativeInorderTraversal();
        Assert.assertEquals(EXPECTED_LIST, traversal.traverse(TEST_NODE));
    }
}
