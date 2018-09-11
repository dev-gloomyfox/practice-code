package com.gloomyfox.code.hash;

public class HashTableProblems {

    /**
     * M * N 행렬을 순회하면서 0인 원소를 발견하면 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라
     */
    public int[][] setZeros(int[][] arr) {
        // boolean의 arr를 잘 조절해서 공간 효율성을 개선할 수 있지 않을까?
        boolean[] colsTable = new boolean[arr.length];
        boolean[] rowsTable = new boolean[arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    colsTable[i] = true;
                    rowsTable[j] = true;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(colsTable[i] || rowsTable[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
}
