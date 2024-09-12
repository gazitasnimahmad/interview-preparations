package com.Interview.algorithms.TwoPointer;

// It involves using two pointers that iterate through the data structure in tandem,
// often with one pointer starting from the beginning and the other from the end, or
// both moving at different speeds to meet specific criteria.

//1. Finding all Pairs in a Sorted Array that Sums to a Target

public class MatchtargetPairs {
    public  static  void  main (String[] args){
        int target = 30;
        int[] arr = new int[20];
        for( int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }
        //  start
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println(arr[left]+" - "+arr[right]);
                left++;
                right--;
            }

            else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
    }
}
