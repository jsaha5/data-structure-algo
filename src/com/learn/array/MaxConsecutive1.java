package com.learn.array;

public class MaxConsecutive1 {
    public static void main(String args[]) {
        int nums[] = {1, 1, 0, 1, 1, 1,4,1,4,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;

    }

}
