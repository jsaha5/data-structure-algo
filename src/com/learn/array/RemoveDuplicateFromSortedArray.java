package com.learn.array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]) {
        int[] nums = {1, 1,2};
        int length = removeDuplicates(nums);
        System.out.println(length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i+1];
            }
        }

        return j;
    }
}
