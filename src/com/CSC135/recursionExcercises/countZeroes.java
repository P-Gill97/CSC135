package com.CSC135.recursionExcercises;

public class countZeroes {
    public static void main(String[] args){
        int[] array = new int[] {1,0,2,1,0,1,0,1,0,1,1,1,0,};
        System.out.println(func(array, 12));
    }
    public static int func (int[] array , int size){
        if(size <= 0){
            return 0;
        }else if(array[size] == 0) {
            return 1 + func(array, size -1);
        }
        else{
            return func(array, size-1);
        }
    }
}
