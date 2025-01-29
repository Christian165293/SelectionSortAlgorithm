package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Random random = new Random();
        int[] array = new int[10];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(101);
        }
        System.out.println("your unsorted array = " + Arrays.toString(array));
        selectionSort.selectionSort(array);
        System.out.println("your sorted array = " + Arrays.toString(array));
    }
}