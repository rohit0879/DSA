// Contains Duplicate 

import java.util.*;
public class Duplicate{
    public static boolean Dub(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i!=j){
                    if(arr[i] == arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        int n=arr.length;
        System.out.println(Dub(arr,n));

    }
}