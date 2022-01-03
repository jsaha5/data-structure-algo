package com.learn.array;

//Given an array of integers arr, return true if and only if it is a valid mountain array.
//
//        Recall that arr is a mountain array if and only if:
//
//        arr.length >= 3
//        There exists some i with 0 < i < arr.length - 1 such that:
//        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
public class MountainArray {
    public static void main(String args[]) {

        int arr[] = {1,7,9,5,4,1,2};
        System.out.println(validMountainArray(arr));


    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i = 0;
        while (i < arr.length && i+1< arr.length && arr[i] < arr[i+1] ) {
            i++;
        }
        if(i==0 || i+1 > arr.length){
            return false;
        }
        while(i < arr.length && i+1< arr.length ){
            if(arr[i]<=arr[i++ +1])
                return false;
        }

        return true;

    }
}
