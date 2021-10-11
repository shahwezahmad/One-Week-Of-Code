package arrays;
class RichestWealth{
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,4},
            {4,6,7}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);

    }
    public static int maximumWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            int sum =0 ;
            for(int  j = 0 ; j< arr[i].length; j++){
                sum += arr[i][j];

            }
            if(sum > ans) ans = sum;
        }

        return ans;
    }
}