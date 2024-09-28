package com.Interview.algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }
    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int i = l-1,j=0;
        int pi = h;

        for(j=l;j<h;j++){
            if(arr[j] < arr[pi]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,j);
        return i+1;
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}