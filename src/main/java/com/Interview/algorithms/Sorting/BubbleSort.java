package com.Interview.algorithms.Sorting;


public class BubbleSort {

    public static void main(String[] args){
        int[] array = {12, 11, 13, 5, 6, 7};
//        for (int value: array){
//            System.out.println(value);
//        }

        System.out.println("After sorting");
        bubbleSort(array);
        for (int value: array){
            System.out.println(value);
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0 ;i< n-1 ;i++){
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
