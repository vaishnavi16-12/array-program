package com.bridgelabz.arrayprogram;

public class SmallestElement {
    public static void main(String[] args) {
        int arr []= {10,20,30,40,50};

        int min=arr[0];

        for(int i= 1; i< arr.length; i++){
            if(arr[i] < min){
                min= arr[i];

            }
        }
        System.out.println("SmallestElement: "+ min);
    }
}
