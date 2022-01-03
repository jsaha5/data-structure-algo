package com.learn.array;

import java.util.HashMap;
import java.util.Map;

//Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
//
//        More formally check if there exists two indices i and j such that :
public class SearchArray1 {
    public static void main(String args[]) {
        int arr[] = {0,0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        if (arr.length == 0)
            return false;


        for (int i=0;i<arr.length;i++) {
            for (int j= 0 ; j<arr.length;j++)
            {
                if( i!=j && arr[i]==2*arr[j]) {
                    return true;
                }
            }

        }
        return false;
    }
}
