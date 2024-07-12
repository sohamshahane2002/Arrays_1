package ARRAYS;
import java.util.*;

public class SecLargestElement {
    
    public static int seclargest(int arr[]){
        int largest = arr[0];
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        int seclargesst= arr.length-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>seclargesst && arr[i]!=largest){
                seclargesst=arr[i];
            }
        }System.out.println(seclargesst);
        return seclargesst;
    }
    
    public static void main(String[] args) {
        int arr[]= {15,65,56,77,98,32};
        System.out.println("Second Largest is : " + seclargest(arr));
    }

}
