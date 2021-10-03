package arrays;
import java.util.Arrays;
class BuildArray{
    public static void main(String args[]){
        int arr[] = {5,0,1,2,3,4};
        int ans[]  = buildArray(arr);
        System.out.println(Arrays.toString(ans));

        
    }
    
    static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i =0 ; i< ans.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}