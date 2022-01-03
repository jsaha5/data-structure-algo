package com.learn.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String args[]) {
       int nums1 [] = {0}, m = 0, nums2 [] = {1}, n = 1;
       merge(nums1, m, nums2, n);
       print(nums1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j = n-1;
       int index = m+n-1;
       while(j >= 0){
           if ( i>=0 && nums1[i] > nums2[j]) {
               nums1[index--] = nums1[i--];
           } else {
               nums1[index--] = nums2[j--];
           }

        }
    }
    private static void print(int[] nums) {
        Arrays.stream(nums).forEach(i -> System.out.print(i));
    }

}
