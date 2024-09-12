package com.Interview.algorithms.Sorting;


public class BubbleSort {

    public static void main(String[] args){
        int[] array = new int[]{8,7,6,5,4,3,2,1};
        for (int value: array){
            System.out.println(value);
        }

        System.out.println("After sorting");
        bubbleSort(array);
        for (int value: array){
            System.out.println(value);
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0 ;i< n ;i++){
            for(int j = 0; j< n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
