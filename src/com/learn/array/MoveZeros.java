package com.learn.array;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
public class MoveZeros {
    public static void main(String args[]) {

        int nums[] = {1, 2, 0,1 ,3, 12,111};
        int i=0,j=0;
        int len = nums.length;
        while(i<len && j<len){
            if(nums[j]==0){
                j++;
            }else{
                nums[i++]=nums[j++];
            }
        }
        while(i<len){
            nums[i++] = 0;
        }

    }
    private static void inPlace(int arr[]) {
        // We have two pointer one from read one for write
        // initially both are same
        // we increase the read counter if we get a 0 and write counter still points to zero
        // now again we read, if again we get 0 read counter ++ until we get anythiing other that zero
        // after that we swap
        int read = 0;
        int write = 0;
        int count=0;
        while (read < arr.length) {
            if (arr[read] != 0) {
                if (read != write) {
                    arr[write] = arr[read];
                    arr[read] = 0;
                    read = write;
                    count++;
                }
                read++;
                write++;

            } else {
                read++;
            }
        }
        System.out.println(arr.length-count);
        System.out.println("----");
        Arrays.stream(arr).forEach(System.out::println);
    }
    private static void notIbPlaceSolution(int arr[]) {
        int arr1[] = new int[arr.length];
        int count = 0;
        // Create another array of same size
        // Iterate the input array
        // Place all non zero elements in the new array
        //Then put all the zeros at the end of the new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[count++] = arr[i];
            }
        }
        for (int j = count; j < arr1.length; j++) {
            arr1[j] = 0;
        }
        Arrays.stream(arr1).forEach(System.out::println);
    }
}
