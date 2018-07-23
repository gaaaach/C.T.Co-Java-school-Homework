package com.example.task1;

import java.util.Arrays;

public class task1 {

    public int maxRepeating(int[] arrayIntegers)
    {
        int counter = 1, maxVal = 0, repeatTimes = 0;
        for (int i = 1; i < arrayIntegers.length; i++) {

            if(arrayIntegers[i]!=arrayIntegers[i-1]){
                if(counter>repeatTimes){
                    maxVal=arrayIntegers[i-1];
                    repeatTimes=counter;
                }
                counter=1;
            }else {
                counter++;
            }
        }
        if( counter>repeatTimes){
            maxVal=arrayIntegers[arrayIntegers.length-1];
            repeatTimes=counter;
        }
        return maxVal;
    }

    public static void main(String[] args) {

        int[] arrayIntegers = {1,1,2,2,2,3,4,5,6,7,7,7,7,2,2,3,3,4,4,4,4,4,4,4};
        System.out.println("Array in which to find the longest occurring sequence : "+Arrays.toString(arrayIntegers));
        task1 t = new task1();
        int maxVal = t.maxRepeating(arrayIntegers);
        System.out.println("Longest repeating sequence of integers was for: "+ maxVal);

    }
}
