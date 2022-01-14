package com.company;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 5;
        arr[1] = 9;
        arr[2]= 8;
        arr[3] = 11;
        arr[4] = 99;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 99){
                index = i;
            }
        }
        System.out.println(index);
    }

}
