package com.learn.array;

public class FindEvenNoOfDigits {

    public static void main(String args[]) {
        int nums[] = {12, 345, 2, 6, 7891, -454};
        System.out.println(findNumbers(nums));

    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        int digitCount = 0;
        for (int num : nums) {
            if (num != 0) {
                while (num != 0) {
                    num /= 10;
                    digitCount++;
                }
                if (digitCount % 2 == 0)
                    count++;
                digitCount = 0;
            }

        }
        return count;
    }
}
