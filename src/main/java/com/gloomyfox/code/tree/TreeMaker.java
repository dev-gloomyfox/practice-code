package com.gloomyfox.code.tree;

import com.gloomyfox.structure.Node;

public class TreeMaker {

    /**
     * 오름차순으로 정렬된 배열로부터 그 높이가 가장 낮은 이진 탐색 트리를 생성하는 알고리즘을 작성하라.
     * 배열 내 모든 원소는 배열 내에서 유일한 값을 갖는다.
     */
    public Node createMinimalBST(int[] sortedArray) {
        return create(0, sortedArray.length - 1, sortedArray);
    }

    private Node create(int start, int end, int[] arr) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid], null, null);
        node.setLeft(create(start, mid - 1, arr));
        node.setRight(create(mid + 1, end, arr));

        return node;
    }
}
