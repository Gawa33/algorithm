package com.gawa.algorithm.test;

import com.gawa.algorithm.sort.Bubble;
import com.gawa.algorithm.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr = {2,3,5,6,1,7,9};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
