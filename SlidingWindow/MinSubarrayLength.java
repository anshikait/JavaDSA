public class MinSubarrayLength {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        while(high < nums.length){
            sum += nums[high];
            while(sum >= target){
                result = Math.min(result, high - low + 1);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    public static void main(String[] args) {
        MinSubarrayLength msal = new MinSubarrayLength();
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(msal.minSubArrayLen(target, arr));
    }
}