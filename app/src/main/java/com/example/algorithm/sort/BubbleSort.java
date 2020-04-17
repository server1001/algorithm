package com.example.algorithm.sort;

public class BubbleSort {


    public int [] sort01(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                int tem=0;
                if (array[j]>array[j+1]){
                    tem=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tem;
                }
            }
        }
        return array;
    }
    public  int [] sort02( int [] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean isEnd=true;
            for (int j = 0; j < array.length - i-1; j++) {
                int  tem=0;
                if (array[j]>array[j+1]){
                    tem=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tem;
                    isEnd=false;
                }
            }
            if (isEnd)
                break;
        }
        return array;
    }


    public int [] sort03(int[] array){
        int lastLength=0;
        int sortLenth=array.length-1;
        for (int i = 0; i < array.length; i++) {
            boolean  isStop=true;
            for (int j = 0; j < sortLenth; j++) {
                int  temp;
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    isStop=false;
                    lastLength=j;
                }
            }
            if (isStop){
                break;
            }
            sortLenth=lastLength;
        }
        return  array;
    }
}
