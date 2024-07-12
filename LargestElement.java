package ARRAYS;

import java.util.*;
public class LargestElement{
    public static int islargestelement(int arr[]){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] > largest){
                largest = arr[i];            }

        }return largest;
    }
    public static void main(String[] args) {
        int arr [] = {1,3,4,8,3,5};
        System.out.println("The largest element in the array is : " + islargestelement(arr));

        

    }
}