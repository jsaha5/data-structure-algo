package com.learn.array;


import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String args[]) {
        int nums[] = {-4,-1,0,3,10};


        Arrays.stream(sortedSquares(nums)).forEach(i->System.out.println(i));

    }
    private static int[] sortedSquares(int[] nums) {

        int front = 0;
        int back = nums.length-1;
        int sortedNum []= new int [nums.length];
        int index =  nums.length-1;
        while(front <= back) {
            if(Math.abs(nums[front])>= Math.abs(nums[back])){
                sortedNum [index--] = nums[front] * nums[front];
                front++;
            } else {
                sortedNum [index--] = nums[back]* nums[back];
                back--;
            }
        }

        return sortedNum;

    }
}
