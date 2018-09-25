package com.gloomyfox.code.recursion;

public class MagicIndexFinder {

    /**
     * 배열 A[0 ~ n-1]에서 A[i] = i인 인덱스 i를 마술 인덱스라고 정의하자.
     * 정렬된 상태의 배열이 주어졌을 때, 마술 인덱스가 존재한다면, 그 값을 찾는 메소드를 작성하라.
     * 배열 안에 중복된 값은 없다.
     */
    public int findMagicIndex(int[] arr) {
        return find(arr, 0, arr.length - 1);
    }

    private int find(int[] arr, int start, int end) {
        // 재귀를 수행할 때 조건을 잘 설정해두어야 무한 루프에 빠지지 않는다.
        if(start > end || start < 0 || end >= arr.length) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == mid) {
            return mid;
        } else if(arr[mid] > mid) {
            return find(arr, start, mid - 1);
        } else {
            return find(arr, mid + 1, end);
        }
    }
}
