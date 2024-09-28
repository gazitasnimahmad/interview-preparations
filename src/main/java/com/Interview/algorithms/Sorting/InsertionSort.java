package com.Interview.algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        insertionSort(arr, 0, arr.length);
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }

    public static void insertionSort(int[] arr, int l, int h){
        for(int i =0 ; i<h; i++){
            for(int j =0 ;j <i;j++){
                if(arr[j] > arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
