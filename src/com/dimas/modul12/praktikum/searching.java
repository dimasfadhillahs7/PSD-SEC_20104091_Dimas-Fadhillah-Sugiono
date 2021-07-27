package com.dimas.modul12.praktikum;
public class searching {
    public static int[] selectionSort(int data[]){
        for (int i = 0; i < data.length; i++){
            int pos = i;
            for (int j = i+1; j < data.length; j++){
                if (data[j] < data[pos]){
                    pos = j;
                }
            }
            if (pos != 1){
                int temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }
    public static int sequential(int[] data, int cari){
        for (int i = 0; i < data.length-1; i++){
            if (data[i] == cari){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int []data, int cari){
        searching.selectionSort(data);
        int star = 0; int end = data.length-1;
        while (star<end){
            int mid = (star + end)/2;
            if (data[mid]==cari){
                return mid;
            }else if (data[mid] < cari){
                star = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static int interpolationSearch(int data[], int cari){
        searching.selectionSort(data);
        int low = 0; int high = data.length-1;
        while (cari>=data[low] && cari<=data[high]){
            int pos = ((cari-data[low]) / (data[high]-data[low])) *(high-low)+low;
            if (data[pos] == cari){
                return pos;
            }if (data[pos] > cari){
                high = pos - 1;
            }else if (data[pos] < cari){
                low = pos + 1;
            }
        }
        return -1;
    }


}

