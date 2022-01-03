package com.learn.array;

import java.util.Arrays;

public class ReplaceGreatestElementOnRight {

    public static void main(String args[]) {
        int arr[] = {17, 18, 5, 4, 6, 1};
        arr = replaceElements1(arr);
        print(arr);
    }

    public static int[] replaceElements1(int[] arr) {
        int greatest = Integer.MIN_VALUE;
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int i = 0;
        int j = i + 1;
        while (i < arr.length - 1) {
            if (j == arr.length ) {
                arr[i] = greatest;
                i++;
                j = i + 1;
                greatest = Integer.MIN_VALUE;
            }
            if (j < arr.length) {
                if (arr[j] > greatest) {
                    greatest = arr[j++];
                } else {
                    j++;
                }
            } else{
                arr[arr.length-1] = -1;
            }

        }
        return arr;
    }

    public static int[] replaceElements(int[] arr) {

        int greatest = Integer.MIN_VALUE;
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > greatest) {
                    greatest = arr[j];
                }

            }
            arr[i] = greatest;
            greatest = Integer.MIN_VALUE;
            if (i == arr.length - 1) {
                arr[i] = -1;
            }

        }
        return arr;
    }

    private static void print(int[] nums) {
        Arrays.stream(nums).forEach(i -> System.out.print(i + " "));
    }
}
