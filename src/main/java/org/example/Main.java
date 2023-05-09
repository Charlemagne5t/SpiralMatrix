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
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

    }
}