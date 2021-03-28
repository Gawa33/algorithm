package com.gawa.algorithm.test;

import com.gawa.algorithm.sort.Quick;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] a={6,2,5,7,8,4,9,0,3,1};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
