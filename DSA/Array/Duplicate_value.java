import java.util.*;
public class Duplicate_value {
    public static void Dub(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){ 
                    System.out.print(arr[i]+","); 
                    break;
                }
            }
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,5,3,5,6,4,5,2};
        int n=arr.length;
        Arrays.sort(arr);
        Dub(arr,n);

    }
}
