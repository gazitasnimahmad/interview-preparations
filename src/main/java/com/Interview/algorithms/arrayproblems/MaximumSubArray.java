package com.Interview.algorithms.arrayproblems;

public class MaximumSubArray {

    public  static  void  main (String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int globalMax =arr[0];
        int currentMax = arr[0];
        for(int i =1; i<arr.length;i++){
            if(currentMax+arr[i] > arr[i])
                currentMax += arr[i];
            else
                currentMax = arr[i];

            if(globalMax<currentMax)
                globalMax = currentMax;
        }
        System.out.println(globalMax);
    }
}
