//  Reverse the array

public class Reverse {
    public static void Rev(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    Rev(arr,n);
   } 
}
