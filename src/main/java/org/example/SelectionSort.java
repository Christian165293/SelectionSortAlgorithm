package org.example;

public class SelectionSort {
    public void selectionSort(int[] arrayInput) {//this method sorts an unsorted array using selection sort
        for (int i = 0; i < arrayInput.length - 1; i++) {//this loop picks an index starting from 0 to the highest index, which will then be compared to every number in the array after each iteration
            for (int j = i + 1; j < arrayInput.length; j++) {//this loops finds the smallest number in the array as compared to the number at index i and stores it into array[i] for each iteration
                if (arrayInput[j] < arrayInput[i]) {//compares the current smallest number against every other number after index i until it find a smaller number
                    int temp = arrayInput[i];//these three lines performs a swap with the current index i and the index j where the smaller number was found
                    arrayInput[i] = arrayInput[j];
                    arrayInput[j] = temp;
                }
            }
        }
    }
}
