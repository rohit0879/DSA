public class Rotation {
    public static void rotates(int a[],int key){
        int low=0;
        int high=a.length-1;
    while(low<=high){
        int mid =(low + high)/2;
        if(a[mid] == key){
            System.out.println(mid);
            break;
        }
        // right side sorted
        else if(a[low]<a[mid]){
            if(key >= a[low] && key < a[mid]){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
         // left side sorted 
        else{
            if(key>a[low] && key<=a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
         } 
    }
    }
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        int key = 2;
        rotates(a,key);
    }
    
}
