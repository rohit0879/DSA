// Maximum and minimum element in an array 

import java.util.*;
public class Max_Min{
    public static void  greaterLesservalue(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum value is : "+min);
        System.out.print("Maximum value is : " +max);
    } 
    public static void main(String args[]){
        int arr[]={3,45,2,6,75,43,61,33};
        int n=arr.length-1;
        greaterLesservalue(arr,n);

    }
}