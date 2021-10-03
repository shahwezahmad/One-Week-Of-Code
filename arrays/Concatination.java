package arrays;
import java.util.Arrays;
class Concatination{
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int ans[]  = getConcatenation(arr);
        int ans2[]  = getConcatenations(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));

        
    }

    // first approach 
    
    static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for(int i =0 ; i<  nums.length;i++){
            ans[i] = nums[i];
        }
        int count =0;
        for(int i =nums.length ; i<  ans.length;i++){
            ans[i] = nums[count++];
        }
        return ans;
    }

    //  short 
    static int[] getConcatenations(int nums[]){
        int ans[] = new int[2 * nums.length];
        for(int i = 0 ; i < nums.length; i++){
            // ans[i] = nums[i];
          ans[i]= ans[i + nums.length] = nums[i];
        }


        return ans;

    }
}