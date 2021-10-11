package arrays;
public class ShuffleArray {
    public static void main(String[] args) {
        int arr[] ={2,5,1,3,4,7};
        int n = arr.length/2;

        int ans[] = shuffle(arr, n);
       
        for (int i : ans) {
            System.out.print(i + " ");
        }

        
    }
    public static int[] shuffle(int[] arr, int n) {
        int left = 0;
        int mid = n;

       int ans[] = new int[2*n];
       for(int  i = 0 ; i < 2*n ; i+=2){
           ans[i] =arr[left++];
           ans[i+1] = arr[mid++];

       }

       return ans ;
        
    }
    




}
