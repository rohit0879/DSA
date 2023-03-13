// Given  n non negative integer repersenting an elevation map where the width of each bar is 1, 
// Compute how many water it can trap after raining 
 
// hight=[4,2,0,6,3,2,5]

import java.util.*;
public class Tapping_RainWater{
    public static int tappingWater(int height[]){
        int n = height.length;

       // left Max
       int left_max[] = new int[n];
       left_max[0] = height[0];
       for(int i = 1 ; i < n ; i++){
        left_max[i] = Math.max(left_max[i-1] , height[i]);
       }

       // right max
       int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for(int i=n-2 ; i >= 0 ; i--){
           right_max[i] = Math.max(right_max[i+1],height[i]);
        }

        int trpWater = 0;
        for(int i=0 ; i<n ; i++){
            int waterLevel = Math.min(left_max[i],right_max[i]);
             trpWater += waterLevel - height[i];  
        }
    
        return trpWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(tappingWater(height));
    }
}