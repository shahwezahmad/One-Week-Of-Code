package arrays;
import java.util.List;
import java.util.ArrayList;

public class GreatestCandies{
    public static void main(String[] args) {
        int arr[] = {4,2,1,1,2};
        int extraCandies =1;
        kidsWithCandies(arr, extraCandies);
        


        
    }
    public static void kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>  ans = new ArrayList<Boolean>(candies.length);
        int max = -1;
        for(int i = 0 ; i < candies.length ; i++){
            max = Math.max(max, candies[i]);
        }
        System.out.println(max);

        for(int i  = 0 ; i < candies.length; i++){
            if(candies[i] + extraCandies  >= max) ans.add(true);
            else ans.add(false);

        } 
        for(Boolean i : ans) System.out.println(i);
    }

}