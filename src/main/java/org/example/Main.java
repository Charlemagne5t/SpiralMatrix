package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    @Test
    public void spiralOrderTest1(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> resultList = new ArrayList<>(List.of(1,2,3,6,9,8,7,4,5));
        Assert.assertEquals(resultList, new Solution().spiralOrder(matrix));
    }
    @Test
    public void spiralOrderTest2(){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> resultList = new ArrayList<>(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
        Assert.assertEquals(resultList, new Solution().spiralOrder(matrix));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int mLength = matrix[0].length;
        int mHeight = matrix.length;
        recursive(matrix, list, 0, 0, mLength, mHeight);
        return list;
    }
    private void recursive(int[][] matrix, List<Integer> list, int i, int j, int mLength, int mHeight) {
        if(mLength == 0 || mHeight ==0) return;
        int counter = mLength;
        for (; counter > 0; j++, counter--) {
            list.add(matrix[i][j]);
        }
        j--;
        i++;
        --mHeight;
        if(mHeight == 0) return;
        counter = mHeight;
        for (; counter > 0; i++, counter--) {
            list.add(matrix[i][j]);
        }
        i--;
        j--;
        --mLength;
        if(mLength == 0) return;
        counter = mLength;
        for (; counter > 0 ; j--, counter--) {
            list.add(matrix[i][j]);
        }
        j++;
        i--;
        --mHeight;
        if(mHeight == 0) return;
        counter = mHeight;

        for (; counter > 0 ; i--, counter--) {
            list.add(matrix[i][j]);
        }
        i++;
        j++;
        --mLength;
        if(mLength == 0) return;
        recursive(matrix, list, i, j, mLength, mHeight);
    }
}