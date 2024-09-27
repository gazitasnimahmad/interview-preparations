package com.Interview.algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr, 0, arr.length-1);
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] L =new int[m-l+1];
        int[] R =new int[r-m];

        for(int i =0;i<L.length;++i)
            L[i] = arr[l+i];
        for(int j=0;j<R.length;++j)
            R[j] = arr[m+1+j];

        int i =0;
        int j=0;
        int k=l;

        while(i<L.length && j<R.length){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<L.length){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<R.length){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
