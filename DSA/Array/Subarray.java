//Maximum subarray

public class Subarray {
    public static void sub(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<n;i++){
            curr = curr + arr[i]; 
            if(curr<0){
                curr=0;
            }
        }
        max=Math.max(max, curr);
        System.out.println("Max subarry is :"+max);
       
    }
    public static void main(String args[]) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        sub(arr,n); 


    }
}
