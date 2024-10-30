package test;

import java.util.Arrays;
import java.util.Collections;

public class arraySortBuiltinmethods {
    public static void main(String[] args) {
        //aproach 1 
/* 
        int a[] = {30,50,20,10,60};

        System.out.println("Array elemens Before sorting"+Arrays.toString(a));
        
        Arrays.parallelSort(a);
        System.out.println("Array elemens after sorting"+Arrays.toString(a));*/

        //aproach 2 
/*
        int a[] = {30,50,20,10,60};
        System.out.println("Array elemens Before sorting"+Arrays.toString(a));
        
        Arrays.sort(a);
        System.out.println("Array elemens after sorting"+Arrays.toString(a)); */

        //apraoch 3 descending order
        Integer a[] = {30,50,20,10,60};
        System.out.println("Array elemens Before sorting"+Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array elemens after sorting"+Arrays.toString(a));




    }
}
