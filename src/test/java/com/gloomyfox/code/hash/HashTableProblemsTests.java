package com.gloomyfox.code.hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableProblemsTests {

    private static final int[][] SET_ZEROS_TEST_ARRAY = {
            {1, 2, 3, 4, 5},
            {2, 0, 4, 1, 2},
            {1, 2, 5, 0, 1},
            {1, 7, 1, 3, 10},
            {4, 2, 1, 9, 0}
    };

    private static final int[][] SET_ZEROS_EXPECTED_ARRAY = {
            {1, 0, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0}
    };

    private HashTableProblems problems;

    @Before
    public void setUp() {
        problems = new HashTableProblems();
    }

    @Test
    public void setZerosTest() {
        Assert.assertArrayEquals(SET_ZEROS_EXPECTED_ARRAY, problems.setZeros(SET_ZEROS_TEST_ARRAY));
    }
}
