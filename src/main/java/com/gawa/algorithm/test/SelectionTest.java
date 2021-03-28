package com.gawa.algorithm.test;

import com.gawa.algorithm.sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {2,3,5,6,1,7,9};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
