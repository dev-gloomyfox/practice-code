package com.gloomyfox.code.tree;

import com.gloomyfox.code.recursion.iteration.PreorderTraversal;
import com.gloomyfox.code.recursion.iteration.IterativePreorderTraversal;
import com.gloomyfox.structure.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeMakerTests {

    private static final int[] TEST_ARRAY = {1, 2, 3, 4, 5, 6, 7};
    // [1, 2, 3, 4, 5, 6, 7]을 가지고 Minimal Tree 생성 시
    //    4
    //  2   6
    // 1 3 5 7
    // 의 형태
    private static final Node EXPECTED_MINIMAL_TREE = new Node(4,
            new Node(2,
                    new Node(1, null, null),
                    new Node(3, null, null)),
            new Node(6,
                    new Node(5, null, null),
                    new Node(7, null, null)));

    private TreeMaker maker;
    private PreorderTraversal traversal;

    @Before
    public void setUp() {
        maker = new TreeMaker();
        traversal = new IterativePreorderTraversal();
    }

    @Test
    public void createMinimalBSTTest() {
        Node node = maker.createMinimalBST(TEST_ARRAY);
        Assert.assertEquals(traversal.traverse(EXPECTED_MINIMAL_TREE), traversal.traverse(node));
    }
}
