package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    public void testSelectionSortWithUnsortedArray() {
        int[] input = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortWithSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortWithReversedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortWithSingleElementArray() {
        int[] input = {1};
        int[] expected = {1};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortWithDuplicatesArray() {
        int[] input = {4, 4, 3, 2, 1, 1};
        int[] expected = {1, 1, 2, 3, 4, 4};
        SelectionSort selectionSortObj = new SelectionSort();
        selectionSortObj.selectionSort(input);
        assertArrayEquals(expected, input);
    }
}