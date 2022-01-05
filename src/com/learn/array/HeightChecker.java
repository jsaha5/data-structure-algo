package com.learn.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//
//        You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//
//        Return the number of indices where heights[i] != expected[i].
//
//
//
//        Example 1:
//
//        Input: heights = [1,1,4,2,1,3]
//        Output: 3
//        Explanation:
//        heights:  [1,1,4,2,1,3]
//        expected: [1,1,1,2,3,4]
//        Indices 2, 4, and 5 do not match.
//        Example 2:
//
//        Input: heights = [5,1,2,3,4]
//        Output: 5
//        Explanation:
//        heights:  [5,1,2,3,4]
//        expected: [1,2,3,4,5]
//        All indices do not match.
//        Example 3:
//
//        Input: heights = [1,2,3,4,5]
//        Output: 0
//        Explanation:
//        heights:  [1,2,3,4,5]
//        expected: [1,2,3,4,5]
//        All indices match.
//
//
//        Constraints:
//
//        1 <= heights.length <= 100
//        1 <= heights[i] <= 100
public class HeightChecker {
    public static void main(String args[]) {
        int[] height = {5,1,2,3,4};


      System.out.println(heightChecker(height));


    }
    public static int   heightChecker(int[] heights) {
        int[] height = new int[101];

        for (int a : heights) {
            height[a]++;
        }

        int count = 0;
        int currHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (height[currHeight] == 0) {
                currHeight++;
            }

            if (heights[i] != currHeight) count++;

            height[currHeight]--;
        }
        return count;
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
