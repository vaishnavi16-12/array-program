package com.bridgelabz.arrayprogram;

public class ArrayProgram {
    public static void main(String[] args) {
        int [] array= {3,4,5,7,10};
        int max= array[0];
        for(int i =0; i <array.length; i++){
            System.out.println(array[i]);
            for (int j=1; i< array.length; i++){
                if(array[j] > max){
                    max=array[j];
                }
            }



            System.out.println("Array Element:");
            System.out.println("Largest Element : " +max);
        }

    }
}
