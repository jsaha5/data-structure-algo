package com.learn.array;

public class RemoveElements {
    public static void main(String args[]) {
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int num = 2;
//        int [] nums = {3};
//        int num = 3;
//        int [] nums = {3,2,2,3};
//        int num = 3;
        int[] nums = {3,3};
        int num = 1;
        int length = removeElement(nums, num);
        System.out.println(length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int front = 0;
        int back = nums.length - 1;
            if( nums.length == 0 ) return 0;
            while ( front < back ) {
                if (nums[front] == val) {
                    nums[front] = nums[front] + nums[back];
                    nums[back] = nums[front] - nums[back];
                    nums[front] = nums[front] - nums[back];
                    back--;

                } else {
                    front++;
                }
            }
            return back;

    }
}
