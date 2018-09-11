package com.gloomyfox.code.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTests {

    private static final int[] EXPECTED_SET = {1, 2, 5, 7, 9, 11, 21, 34, 35, 60, 60, 0};

    private Merge merge;
    private int[] testArrayA;
    private int[] testArrayB;

    @Before
    public void setUp() {
        merge = new Merge();
        testArrayA = new int[] {1, 5, 21, 34, 35, 60, 0, 0, 0, 0, 0, 0};
        testArrayB = new int[] {2, 7, 9, 11, 60, 0};
    }

    @Test
    public void mergeAndSortTest() {
        Assert.assertArrayEquals(EXPECTED_SET, merge.mergeAndSort(testArrayA, testArrayB, 6, 5));
    }
}
