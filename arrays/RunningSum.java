package arrays;
import java.util.Arrays;

public class RunningSum {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int ans[]  = runningSum(arr);
        System.out.println(Arrays.toString(ans));
        
  
    }
    // first approach
    // public static int[] runningSum(int[] nums) {
    //     int sum = 0; 
    //     for (int i = 0  ; i < nums.length; i++) {
    //         nums[i] += sum;
    //         sum = nums[i];
    //     }
    //   return nums;
        
    // }
    
    // Second approach
     public static int[] runningSum(int[] nums) {     
            for (int i = 1  ; i < nums.length; i++) 
                nums[i] += nums[i-1];     
            
          return nums;      
        }
    

    
}
