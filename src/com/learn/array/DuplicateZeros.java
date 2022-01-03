package com.learn.array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String args[]) {
        int nums[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        print(nums);

    }

    public static void duplicateZeros(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0)
                zeroCount++;
        }
        int i = nums.length - 1;
        int j = nums.length + zeroCount - 1;
        while (i !=-1) {
            insert(nums,i,j--);
            if(nums[i] == 0) {
                insert(nums,i,j--);
            }
            i--;

        }

    }

    private static void insert(int[] nums, int i, int j) {
        if (j < nums.length) {
            nums[j] = nums[i];
        }
    }


    private static void print(int[] nums) {
        Arrays.stream(nums).forEach(i -> System.out.print(i));
    }

}
