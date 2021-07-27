package com.dimas.modul11.praktikum;
public class Main_Program {
        public static void main(String[] args) {
        int [] array = new int[] {12, 4, 8, 5, 7, 3, 22, 14, 5, 13};
        int [] array1 = new int[] {42, 24, 18, 51, 73, 31, 22, 14, 15, 13};

        System.out.println("<===Quick_Sort===>");
        System.out.println();
        System.out.println("Array Sebelum Disort :");
        sorting.printArray(array);

        System.out.println("\nArray Setelah Disort :");
        sorting.quicksort(array, 0, array.length-1);
        sorting.printArray(array);

        System.out.println("\n\n\n<=== Merge_Sort===>");
        System.out.println();
        System.out.println("Array Sebelum Disort : ");
        sorting.printArray(array1);

        System.out.println("Array Setelah Disort : ");
        sorting.mergesort(array1, 0, array1.length-1);
        sorting.printArray(array1);
    }

}
