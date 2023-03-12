// More missing number
import java.util.*;
public class Moremiss {
    public static void main(String[] args)
    {
        int[] arr={0,10,8,7,5,4,1,2};
        Arrays.sort(arr);
        int i=1;
        while(i<=10){
            if(arr[i] - arr[i-1] == 1){
               
            }else{
                System.out.print(arr[i-1] +1+" ");
            }
            i++;
        }
    }

}
