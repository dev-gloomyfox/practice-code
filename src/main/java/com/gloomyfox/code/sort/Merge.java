package com.gloomyfox.code.sort;

public class Merge {

    /**
     * 정렬된 배열 A와 B가 주어진다.
     * A의 끝에는 B를 수용할 충분한 여유 공간이 있다.
     * B와 A를 정렬된 상태로 병합하는 메소드를 작성하라.
     *
     * 한 공간 내에서 정렬을 시도하는데, 작은 것부터 정렬하려고하니 예외 사항도 붙고 꼬이는 경우가 발생했었다.
     * 뒷 공간이 비어있을 때는 큰 것부터 비교해서 뒤부터 채우는 것이 가장 간단하게 코드가 짜여지는 것 같다.
     */
    public int[] mergeAndSort(int[] a, int[] b, int lengthA, int lengthB) {
        int sortedIndex = lengthA + lengthB - 1;
        int markA = lengthA - 1;
        int markB = lengthB - 1;

        while(markB >= 0) {
            if(a[markA] > b[markB]) {
                a[sortedIndex] = a[markA];
                markA--;
            } else {
                a[sortedIndex] = b[markB];
                markB--;
            }

            sortedIndex--;
        }

        return a;
    }
}
