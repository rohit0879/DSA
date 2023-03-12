// one number are missing 

public class MissingNumber {
    public static void miss(int a[],int n){
        int total_sum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int missing_number =total_sum - sum ;
        System.out.println("missing number is : "+missing_number);
    }
    public static void main(String args[]){
        int a[]={0,1,2,3,5,6,7,8,9,10};
        int n=a.length;
        miss(a,n);
    }
}
