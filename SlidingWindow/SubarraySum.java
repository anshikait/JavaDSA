public class SubarraySum {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0;
        int high = k-1;
        int sum = 0;
        for(int i = low; i <= high; i++){
            sum += arr[i];
        }
        int result = sum;
        while(high < arr.length){
            result = Math.max(result, sum);
            low++;
            high++;
            if(high > arr.length - 1){
                break;
            }
            sum = (sum - arr[low-1]) + arr[high];
        }
        return result;
    }
    public static void main(String[] args) {
        SubarraySum ss = new SubarraySum();
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(ss.maxSubarraySum(arr, k));
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)