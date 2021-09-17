package com.company;

public class MinAndMax {

    public void sum(){

        int[] array = {-1, 2, 3, 4, 5, -2};

        int sum = 0;
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            else if (array[i] > max){
                max = array[i];
            }
            sum = max + min;
        }
        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);
        System.out.println("sum = " + sum);

    }

}
