package com.dimas.modul11.praktikum;
public class sorting {
    
    public static void quicksort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi- 1);
            quicksort(arr, pi+1, high);
        }
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j <= high-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    public static void printArray(int [] arr){
      int c = arr.length;
      for (int i = 0; i < c; i ++){
          System.out.print(arr[i]+ " ");
      }
    }
    
        private static void merge(int [] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        for (int s = 0; s < n2; s++){
            R[s] = arr[m + 1 + s];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergesort(int arr[], int l, int r){
        if (l < r){
            int m = l + (r - l) / 2;

            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }


    

}
