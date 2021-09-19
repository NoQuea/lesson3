package com.company;

import java.util.Arrays;

public class ArraySum {
    public void arraySum(){

        int[] array = {1,2,3,4,5,6,7};

        int chet = 0;
        int neChet = 0;

        for (int i = 1 ; i < array.length ; i += 2) {
            if (array[i] > 0) {
                neChet = neChet + array[i];
                System.out.println(array[i]);
            }
        }

        System.out.println(Arrays.toString(array) + " sum neChetnix " + neChet);

        for (int i = 0 ; i < array.length ; i += 2) {
            if (array[i] > 0) {
                chet = chet + array[i];
                System.out.println(array[i]);
            }
        }

        System.out.println(Arrays.toString(array) + " sum Chetnix " + chet);
        System.out.println("raznica "+(chet - neChet));
    }
}
