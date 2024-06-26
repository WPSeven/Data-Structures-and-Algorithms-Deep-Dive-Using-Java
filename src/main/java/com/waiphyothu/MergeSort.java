package com.waiphyothu;

public class MergeSort {


    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);


        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

    //{20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end){

        //base case or breaking condition.
        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }


    //{20, 35, -15, 7, 55, 1, -22}
    private static void merge(int[] input, int start, int mid, int end) {

        /*
        And so, input (first) mid minus one, is the last element in the left partition.
        And input mid-second is the first element in the right partition.

        Now, if the last element in the left partition is less than or equal the first element
        in the right partition that means all the elements
        in the left partition are less than or equal
        than the smallest element in the right partition,
        because both of these guys are sorted.
        */
        if (input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i); // copy leftover from left array
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

}
