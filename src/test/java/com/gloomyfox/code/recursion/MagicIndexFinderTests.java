package com.gloomyfox.code.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicIndexFinderTests {

    private static final int[] NO_MAGIC_INDEX_ARRAY = {1, 3, 5, 7, 9};
    private static final int[] LEFT_MAGIC_INDEX_ARRAY = {-40, -20, 0, 3, 6, 10, 19, 21, 40, 90};
    private static final int[] RIGHT_MAGIC_INDEX_ARRAY = {-10, -1, 1, 2, 3, 5, 8};

    private MagicIndexFinder finder;

    @Before
    public void setUp() {
        finder = new MagicIndexFinder();
    }

    @Test
    public void findMagicIndexAtNoMagicIndexArrayTest() {
        Assert.assertEquals(-1, finder.findMagicIndex(NO_MAGIC_INDEX_ARRAY));
    }

    @Test
    public void findMagicIndexAtLeftMagicIndexArrayTest() {
        Assert.assertEquals(3, finder.findMagicIndex(LEFT_MAGIC_INDEX_ARRAY));
    }

    @Test
    public void findMagicIndexAtRightMagicIndexArrayTest() {
        Assert.assertEquals(5, finder.findMagicIndex(RIGHT_MAGIC_INDEX_ARRAY));
    }
}
